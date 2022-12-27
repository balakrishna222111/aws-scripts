# Configure the PagerDuty provider
provider "pagerduty" {
  token = var.PAGERDUTY_TOKEN 
}

terraform {
  required_providers {
    pagerduty = {
      source  = "pagerduty/pagerduty"
    }
  }
}