SUMMARY = "Documentation for texlive-phonetic"
DESCRIPTION = "This package includes the documentation for texlive-phonetic"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn56468"

RPM_NAME = "texlive-phonetic-doc-2026.226.svn56468-58.2.noarch.rpm"
RPM_HASH = "e3b2aa4f49584168d6a6298c427e991b48f7b1afc2b4c93ad9813c05fc5cf2f0bc52193adc5ea66c5f2fb19d4f5c82c01c98e901ec47b83b32909197e6873711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phonetic-doc"

RDEPENDS:${PN} += ""

inherit rpm
