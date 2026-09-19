SUMMARY = "Documentation for texlive-statex"
DESCRIPTION = "This package includes the documentation for texlive-statex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn20306"

RPM_NAME = "texlive-statex-doc-2026.226.1.6svn20306-64.2.noarch.rpm"
RPM_HASH = "516d46c6969fff724b9063317d0f7e536d98e250204236ec86bccbf9c7ba90dbf62cf3f0a27983c46cd9a17123c8a494f24da942509ca0fce6b98cac85b01c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statex-doc"

RDEPENDS:${PN} += ""

inherit rpm
