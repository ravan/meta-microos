SUMMARY = "Documentation for texlive-foilhtml"
DESCRIPTION = "This package includes the documentation for texlive-foilhtml"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn61937"

RPM_NAME = "texlive-foilhtml-doc-2026.226.1.2svn61937-60.2.noarch.rpm"
RPM_HASH = "49b1a310736103bc565e7e26c2b3ad53dba20365b367141b730a8ec1d84dc590d5f564ebf62a08e97eb22a0ca5b5af5547ee4e1b733dcd8355f4b5be7f5e21d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foilhtml-doc"

RDEPENDS:${PN} += ""

inherit rpm
