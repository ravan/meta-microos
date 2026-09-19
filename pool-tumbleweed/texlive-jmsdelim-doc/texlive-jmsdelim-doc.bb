SUMMARY = "Documentation for texlive-jmsdelim"
DESCRIPTION = "This package includes the documentation for texlive-jmsdelim"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn62630"

RPM_NAME = "texlive-jmsdelim-doc-2026.226.0.0.2.0svn62630-63.2.noarch.rpm"
RPM_HASH = "dce1b4e022c59a2c9a3e3cb1d388945e333ddac4fedb7ae1918f1467b9373c7147d8b510a3c80a3813b70612b1ce3dc474ab037674810d8b18827a8447aad60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jmsdelim-doc"

RDEPENDS:${PN} += ""

inherit rpm
