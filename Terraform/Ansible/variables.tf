variable "key_name" {
  default = "devops-aws-demo"
}

variable "pvt_key" {
  default = "/root/.ssh/devop-aws-demo.pem"
}

variable "us-east-zones" {
  default = ["us-east-2", "us-east-1"]
}

variable "sg-id" {
  default = "sg-047b1b2b557d3339d"
}
