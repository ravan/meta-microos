SUMMARY = "Documentation for texlive-qrcode"
DESCRIPTION = "This package includes the documentation for texlive-qrcode"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.51svn77682"

RPM_NAME = "texlive-qrcode-doc-2026.226.1.51svn77682-60.4.noarch.rpm"
RPM_HASH = "0181dfaf10c1c79dbaf79171308f775de3a54d4c8e65f540d7af777c19da4228dc92c9103c5ca5f5df8640acc80d5cc484e4233803b0ad1d32611617b451e323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
