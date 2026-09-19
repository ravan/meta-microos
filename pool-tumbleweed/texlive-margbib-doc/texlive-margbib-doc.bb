SUMMARY = "Documentation for texlive-margbib"
DESCRIPTION = "This package includes the documentation for texlive-margbib"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0csvn15878"

RPM_NAME = "texlive-margbib-doc-2026.226.1.0csvn15878-59.2.noarch.rpm"
RPM_HASH = "a2a9a220f153172e60ad9defff4aa83c0d0d234c8037b4b44f8515f8aeff8adaa46034812320e888eb1fbca2add7c991f66d9f19a5167343942f2c6f0ab11cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-margbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
