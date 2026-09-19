SUMMARY = "Documentation for texlive-cascadia-code"
DESCRIPTION = "This package includes the documentation for texlive-cascadia-code"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.0.2svn77682"

RPM_NAME = "texlive-cascadia-code-doc-2026.226.0.0.0.2svn77682-59.2.noarch.rpm"
RPM_HASH = "06a53f7bdfc5faf384861e60a784458099f85d8835b7637b14267973ce40c8fb82963687cbc657bb25ea9a443d59423c6e8fd30ae0a57d75083af8915a2cfc50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cascadia-code-doc"

RDEPENDS:${PN} += ""

inherit rpm
