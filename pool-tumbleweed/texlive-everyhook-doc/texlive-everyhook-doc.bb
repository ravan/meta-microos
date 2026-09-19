SUMMARY = "Documentation for texlive-everyhook"
DESCRIPTION = "This package includes the documentation for texlive-everyhook"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn35675"

RPM_NAME = "texlive-everyhook-doc-2026.226.1.2svn35675-59.2.noarch.rpm"
RPM_HASH = "5801fadad0f99ef9367856dbe3cb22065c6d7a0322a48981c0ad7e69ca557090cda38236d2266e909a456b476724191ec81ab3030fe524082aadbdc5dfc2f9a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everyhook-doc"

RDEPENDS:${PN} += ""

inherit rpm
