SUMMARY = "Update version constraints in your Terraform configurations"
DESCRIPTION = "Features \
 \
* Update version constraints of Terraform core, OpenTofu core, providers, and \
  modules \
* Update dependency lock files (.terraform.lock.hcl) without Terraform CLI \
* Update all your Terraform configurations and lock files recursively under a \
  given directory \
* Get the latest release version from the GitHub, GitLab, Terraform Registry, \
  or OpenTofu Registry \
* Terraform v0.12+ support \
 \
If you integrate tfupdate with your favorite CI or job scheduler, you can check \
the latest release daily and create a Pull Request automatically."
LICENSE = "MPL-2.0"

PV = "0.10.2"

RPM_NAME = "tfupdate-0.10.2-1.2.aarch64.rpm"
RPM_HASH = "31b771fc45b3573ea76a9b9febcf920e80d58fc0898a561a9a29d8f8f9e8ecbb6f9a83779bafcbb169cff1235230d99c1f98122f4a780c3e9b2939919111742c"

RPROVIDES:${PN} += "tfupdate"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
