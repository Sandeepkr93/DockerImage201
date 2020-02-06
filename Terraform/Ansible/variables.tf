variable "key_name" {
  default = "devopsTerra"
}

variable "pvt_key" {
  default = "/root/.ssh/sandeep-aws.pem"
}

variable "us-east-zones" {
  default = ["us-east-1a", "us-east-1b"]
}

variable "sg-id" {
  default = "sg-0475f39960a07679f"
}
