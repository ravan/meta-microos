SUMMARY = "Documentation for texlive-boolexpr"
DESCRIPTION = "This package includes the documentation for texlive-boolexpr"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.14svn17830"

RPM_NAME = "texlive-boolexpr-doc-2026.226.3.14svn17830-59.2.noarch.rpm"
RPM_HASH = "401d2fd4011ebe302f58e9970ec9a44bd94c907eadb0a04e13bac5c19de546256667590380d69fa36420b33a6fd53cc180c35036ca5fcbb60bec7b5547c3c21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boolexpr-doc"

RDEPENDS:${PN} += ""

inherit rpm
