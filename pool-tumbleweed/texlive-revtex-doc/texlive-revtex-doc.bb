SUMMARY = "Documentation for texlive-revtex"
DESCRIPTION = "This package includes the documentation for texlive-revtex"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2fsvn67271"

RPM_NAME = "texlive-revtex-doc-2026.226.4.2fsvn67271-60.4.noarch.rpm"
RPM_HASH = "cf1f72b8baa87e7a18e18bf4f97bb14756b2671d7dd1c45721c22a1c2ffef4c8270b23740642568abeccc128efb540fa96800198c02db1122eec005d083f9c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
