SUMMARY = "Documentation for texlive-chappg"
DESCRIPTION = "This package includes the documentation for texlive-chappg"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1bsvn77682"

RPM_NAME = "texlive-chappg-doc-2026.226.2.1bsvn77682-59.2.noarch.rpm"
RPM_HASH = "0ffe77cf98cb2dd9870b731708c61015a8e0cdf2c11b091f241c3f7a5943b59d6076794417c893f5c393f72d4bbd96b3636ab62b48301b31af8f59505e334d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chappg-doc"

RDEPENDS:${PN} += ""

inherit rpm
