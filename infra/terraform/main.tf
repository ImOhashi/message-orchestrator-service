module "sns" {
  sns_name = var.sns_name
  source   = "./modules/sns"
}