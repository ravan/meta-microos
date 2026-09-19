SUMMARY = "Documentation for texlive-fragoli"
DESCRIPTION = "This package includes the documentation for texlive-fragoli"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.3svn76924"

RPM_NAME = "texlive-fragoli-doc-2026.226.1.2.3svn76924-60.2.noarch.rpm"
RPM_HASH = "6f71f6220c68e52b44587beb691df15ac7515dcdc579c66a4bbb04c97195bf5f434474992d8695f268e84ad7c8e1092a2bab9db78cdd9559b44fc3fc8a21289b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fragoli-doc"

RDEPENDS:${PN} += ""

inherit rpm
