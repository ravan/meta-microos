SUMMARY = "Documentation for texlive-rcs"
DESCRIPTION = "This package includes the documentation for texlive-rcs"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-rcs-doc-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "5d959b0910178474ded8d37a7a15a66d3259cbdc4f966b9f1fca2e6a4c17f31e0b5df493c860d4dd2e311edc81570297b004c62671fed898d4f2f26c70a76990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-doc"

RDEPENDS:${PN} += ""

inherit rpm
