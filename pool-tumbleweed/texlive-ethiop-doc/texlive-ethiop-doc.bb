SUMMARY = "Documentation for texlive-ethiop"
DESCRIPTION = "This package includes the documentation for texlive-ethiop"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-ethiop-doc-2026.226.0.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "0ebe3bcd1e789071679a538fb07683a61947fbf2cc45c8b29331d037b98a028aed59b1dca6540a7334b874b60b99de36f2875adbf8f6ebaa7234a6ecc6cc8109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ethiop-doc"

RDEPENDS:${PN} += ""

inherit rpm
