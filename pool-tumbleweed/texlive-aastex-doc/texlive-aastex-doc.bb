SUMMARY = "Documentation for texlive-aastex"
DESCRIPTION = "This package includes the documentation for texlive-aastex"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.0.1svn75970"

RPM_NAME = "texlive-aastex-doc-2026.226.7.0.1svn75970-61.2.noarch.rpm"
RPM_HASH = "5dd473f8e625b9c6260b381b90dec17850a5a0c061efb9b6c32c0ec66090fb588a3b1ddd889d6b52a60bac2a4659217b28c3f1074667895771c8cafaf14ea6ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aastex-doc"

RDEPENDS:${PN} += ""

inherit rpm
