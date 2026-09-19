SUMMARY = "Documentation for texlive-autonum"
DESCRIPTION = "This package includes the documentation for texlive-autonum"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.11svn77682"

RPM_NAME = "texlive-autonum-doc-2026.226.0.0.3.11svn77682-60.2.noarch.rpm"
RPM_HASH = "6234f1cc2f15cfed96e0a9b0ec4013b01d30e900a00f9ebf1a48b8d8308c6c2c7c72cc8e01780d07f8026c9c9cbc3a8e4c25d7a86b99d0e114a7469d035fd499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autonum-doc"

RDEPENDS:${PN} += ""

inherit rpm
