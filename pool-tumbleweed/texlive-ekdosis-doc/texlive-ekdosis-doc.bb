SUMMARY = "Documentation for texlive-ekdosis"
DESCRIPTION = "This package includes the documentation for texlive-ekdosis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4svn69568"

RPM_NAME = "texlive-ekdosis-doc-2026.226.1.4svn69568-61.4.noarch.rpm"
RPM_HASH = "030e3c649f35bc4d9c4eba496826f6e2bda7be8c9cd995d354da25589de9f0f87d3e7a29bb7360f8dbfe42add79bb8d45d276f85b8e1a9c41fb17e858c99245c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekdosis-doc"

RDEPENDS:${PN} += ""

inherit rpm
