variable "users" {
  type = map(object({
    name  = string
    email = string
  }))
}


variable "teams" {
  type = map(object({
    name  = string
  }))
}

variable "PAGERDUTY_TOKEN" {}
