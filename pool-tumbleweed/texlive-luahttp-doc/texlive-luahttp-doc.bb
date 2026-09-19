SUMMARY = "Documentation for texlive-luahttp"
DESCRIPTION = "This package includes the documentation for texlive-luahttp"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn67348"

RPM_NAME = "texlive-luahttp-doc-2026.226.1.0.1svn67348-59.2.noarch.rpm"
RPM_HASH = "6ff90221d358089d628c277bca6ee28fd9e12d6616848eb0b4c961e811faa688cff521e125f6d4a070dcb290140c9d52c9ebe5b3eda85e47670e8b711a05b6cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luahttp-doc"

RDEPENDS:${PN} += ""

inherit rpm
