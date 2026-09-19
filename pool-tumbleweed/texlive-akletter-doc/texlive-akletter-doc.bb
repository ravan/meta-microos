SUMMARY = "Documentation for texlive-akletter"
DESCRIPTION = "This package includes the documentation for texlive-akletter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5isvn15878"

RPM_NAME = "texlive-akletter-doc-2026.226.1.5isvn15878-61.2.noarch.rpm"
RPM_HASH = "99eb5c8ca1953d0bb79dd3cdfd43f49272a201a387a0bfd5a28777b61736110e9caafdcc350118f800106b71f6cf63062b689e97c89d5ca00341c57e699e7000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-akletter-doc-de;en \
texlive-akletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
