SUMMARY = "Documentation for texlive-babel-english"
DESCRIPTION = "This package includes the documentation for texlive-babel-english"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3rsvn77682"

RPM_NAME = "texlive-babel-english-doc-2026.226.3.3rsvn77682-60.2.noarch.rpm"
RPM_HASH = "7f44b6bc216acaa2a30489676c3d4081ce3dcfc09a76a172438306c766c6bcb21920ed0456b52ccb28c9d05eb7c5a75c53647e9b00013a8977e8a4cebdeeb757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
