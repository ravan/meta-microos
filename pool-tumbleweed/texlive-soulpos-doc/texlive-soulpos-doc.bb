SUMMARY = "Documentation for texlive-soulpos"
DESCRIPTION = "This package includes the documentation for texlive-soulpos"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-soulpos-doc-2026.226.1.2svn77682-64.2.noarch.rpm"
RPM_HASH = "4a34ea0cb72ee869621d0744d8627481fd23ac4f1882e6dabd0961400b20a77431a412369422256e7d5bd6eeb3730925776a57c7b111d15a7c09f22150066fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soulpos-doc"

RDEPENDS:${PN} += ""

inherit rpm
