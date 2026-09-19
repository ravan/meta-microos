SUMMARY = "Documentation for texlive-chinesechess"
DESCRIPTION = "This package includes the documentation for texlive-chinesechess"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn78101"

RPM_NAME = "texlive-chinesechess-doc-2026.226.1.2.0svn78101-60.2.noarch.rpm"
RPM_HASH = "7c1beb3ad3b16c5c2f12c526bec85792fbfefb5239bda3d26a5d2395ada0491725268e8107a31fb500a8742b6de0fdf39fdd9cf636241131ef9beeb922b5cf46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chinesechess-doc-zh \
texlive-chinesechess-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
