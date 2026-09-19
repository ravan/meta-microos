SUMMARY = "Documentation for gnubg"
DESCRIPTION = "Manual for GNU Backgammon. See description of gnubg for more details."
LICENSE = "GFDL-1.3-only"

PV = "1.08.003"

RPM_NAME = "gnubg-doc-1.08.003-1.6.noarch.rpm"
RPM_HASH = "727bcd6dbdde8956658479141df33c6f1dc30d14c2f6c025880fef2bb2951024090ca66e5df7d619503ac55f2fc12969c76a1d258321a0ddb8a0f313955d6d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-doc"

RDEPENDS:${PN} += ""

inherit rpm
