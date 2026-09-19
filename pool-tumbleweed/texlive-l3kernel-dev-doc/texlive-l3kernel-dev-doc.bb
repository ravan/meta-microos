SUMMARY = "Documentation for texlive-l3kernel-dev"
DESCRIPTION = "This package includes the documentation for texlive-l3kernel-dev"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77953"

RPM_NAME = "texlive-l3kernel-dev-doc-2026.226.svn77953-63.2.noarch.rpm"
RPM_HASH = "4f01d96a3de8dce3866c5a83dc8523cfc0852500d0b68891b7d066766f7eba9eadd901ed67a3904c98f55285133b7a2e21b5fee01d85176b45d26cd9928f8497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3kernel-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
