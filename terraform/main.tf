provider "aws" {
  region = "us-west-2"
}

resource "aws_ecs_cluster" "default" {
  name = "fraud-detection-cluster"
}