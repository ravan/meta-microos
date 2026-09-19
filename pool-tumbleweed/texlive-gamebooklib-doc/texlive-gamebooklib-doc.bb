SUMMARY = "Documentation for texlive-gamebooklib"
DESCRIPTION = "This package includes the documentation for texlive-gamebooklib"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn67772"

RPM_NAME = "texlive-gamebooklib-doc-2026.226.1.4svn67772-60.2.noarch.rpm"
RPM_HASH = "6cfee677385e3e4d2d4d0be5486848627a452e8c5443ce5dc2917d14958a427cb27a073e47d24236f087edd37507f781e4dd534f9c14c20853c0193b8935622b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gamebooklib-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
