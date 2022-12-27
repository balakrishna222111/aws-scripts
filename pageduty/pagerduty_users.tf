# Create a PagerDuty user
resource "pagerduty_user" "user" {

  for_each = var.users

  name  = each.value.name
  email = each.value.email

}

# Create a PagerDuty team
resource "pagerduty_team" "team" {

  for_each = var.teams

  name  = each.value.name
}

# resource "pagerduty_team_membership" "team_membership" {

#   for_each = pagerduty_user.user
#   user_id = each.value.id

#   for_each = pagerduty_user.team


#   team_id = each.value.id
#   role    = "manager"
# }


