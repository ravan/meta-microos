SUMMARY = "Documentation for texlive-yaletter"
DESCRIPTION = "This package includes the documentation for texlive-yaletter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn42830"

RPM_NAME = "texlive-yaletter-doc-2026.226.1.1svn42830-59.4.noarch.rpm"
RPM_HASH = "b3ca87e842de36dfa253bc6fba0a0a7b353e09e298f942ef00ab73ec1825092882a0d6d0c9fefcba4e14eb6ae6a1cc0b62aa11a7bec9c223088f6a64f61c2d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yaletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
