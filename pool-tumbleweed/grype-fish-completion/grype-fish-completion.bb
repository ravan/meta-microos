SUMMARY = "Fish Completion for grype"
DESCRIPTION = "Fish command line completion support for grype."
LICENSE = "Apache-2.0"

PV = "0.118.0"

RPM_NAME = "grype-fish-completion-0.118.0-1.1.noarch.rpm"
RPM_HASH = "d3ac746ef070216ecc456c4fa3f5543f613157e5d9d222393b0880aaa027005e32ccb23c7d21a93ac0425c89d4826da510ecc2bfef7f098e9f039d158e85a096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grype-fish-completion"

RDEPENDS:${PN} += "grype"

inherit rpm
