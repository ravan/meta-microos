SUMMARY = "Documentation for texlive-bmstu-iu8"
DESCRIPTION = "This package includes the documentation for texlive-bmstu-iu8"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn76373"

RPM_NAME = "texlive-bmstu-iu8-doc-2026.226.1.9svn76373-59.2.noarch.rpm"
RPM_HASH = "6d308353f44607b4ce3a5a80ef71cba8159263adedf70c0ef884b9956878bd56c5c6fde0e3b824cb2b1dba3b7297cccfbc67f29f0ad5543ec1a5d33a81453d66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bmstu-iu8-doc-ru \
texlive-bmstu-iu8-doc"

RDEPENDS:${PN} += ""

inherit rpm
