SUMMARY = "Documentation for texlive-argumentation"
DESCRIPTION = "This package includes the documentation for texlive-argumentation"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn75931"

RPM_NAME = "texlive-argumentation-doc-2026.226.1.6svn75931-61.2.noarch.rpm"
RPM_HASH = "3c46770355365c49cff7c4fd8ef6d3743bfd4f0af0687e05b089fbc3cb359e5e5436f64232049995287b4c10769fe7cf6900cd681035ce4d905b61511cb65fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-argumentation-doc"

RDEPENDS:${PN} += ""

inherit rpm
