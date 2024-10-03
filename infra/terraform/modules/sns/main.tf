resource "aws_sns_topic" "message_orchestrator" {
  name = var.sns_name
}