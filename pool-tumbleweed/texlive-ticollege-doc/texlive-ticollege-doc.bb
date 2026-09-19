SUMMARY = "Documentation for texlive-ticollege"
DESCRIPTION = "This package includes the documentation for texlive-ticollege"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn36306"

RPM_NAME = "texlive-ticollege-doc-2026.227.1.0svn36306-62.2.noarch.rpm"
RPM_HASH = "0b54fb4612b88eb21b703b2c9b26d388766bca55d2ff59cca0a6f53ebbe0c267bd20806f4fe3725ca69d1c59420eb61bcca1622dffa7019606526d388fa825a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ticollege-doc-fr \
texlive-ticollege-doc"

RDEPENDS:${PN} += ""

inherit rpm
