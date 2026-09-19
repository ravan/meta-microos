SUMMARY = "Documentation for texlive-komacv-rg"
DESCRIPTION = "This package includes the documentation for texlive-komacv-rg"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.2svn49064"

RPM_NAME = "texlive-komacv-rg-doc-2026.226.0.0.9.2svn49064-63.2.noarch.rpm"
RPM_HASH = "d73168396d4750a09aabad04f8e014397be9660c14489b62fbe41423efe361da5b3702f4999560c6c56a33844e4d3b50ca8d407e925617ccd1a5844aafdca53e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-komacv-rg-doc"

RDEPENDS:${PN} += ""

inherit rpm
