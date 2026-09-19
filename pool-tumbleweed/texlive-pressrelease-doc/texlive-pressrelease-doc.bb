SUMMARY = "Documentation for texlive-pressrelease"
DESCRIPTION = "This package includes the documentation for texlive-pressrelease"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35147"

RPM_NAME = "texlive-pressrelease-doc-2026.226.1.0svn35147-59.2.noarch.rpm"
RPM_HASH = "d1f70f76eacf1dee9935c7ebc3c322bc6b759114311489a6f12428c5495b3215846ed0f2836fd6c5eda45a759f5d56e25a5446393df8949191074f30aa508ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pressrelease-doc"

RDEPENDS:${PN} += ""

inherit rpm
