SUMMARY = "Thin wrapper for Terraform for working with multiple Terraform modules"
DESCRIPTION = "Terragrunt is a thin wrapper for Terraform that provides extra tools for \
keeping your Terraform configurations DRY, working with multiple Terraform \
modules, and managing remote state."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "terragrunt-1.1.2-1.1.aarch64.rpm"
RPM_HASH = "064e5dd9753c61d9fd19752f2c7818fb200986eae52abfa57c51d1e7d5c395fa8e7cbaf9d4c2f3211e588274754f30f8a28b24b8289f8d11d53a07c8c550ef58"

RPROVIDES:${PN} += "terragrunt"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
