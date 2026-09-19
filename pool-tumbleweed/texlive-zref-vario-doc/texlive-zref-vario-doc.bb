SUMMARY = "Documentation for texlive-zref-vario"
DESCRIPTION = "This package includes the documentation for texlive-zref-vario"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.12svn77682"

RPM_NAME = "texlive-zref-vario-doc-2026.226.0.0.1.12svn77682-59.4.noarch.rpm"
RPM_HASH = "3a2b377f3ce861fac3bb3abd1eb78369565d5b8f6091aff5ea35840eb1256d75aae1b462f4addcebe59732c22cbb6d15e314843c78ed2b0006b74d980fcac083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-vario-doc"

RDEPENDS:${PN} += ""

inherit rpm
