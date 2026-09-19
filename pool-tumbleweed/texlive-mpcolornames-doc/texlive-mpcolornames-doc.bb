SUMMARY = "Documentation for texlive-mpcolornames"
DESCRIPTION = "This package includes the documentation for texlive-mpcolornames"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20svn23252"

RPM_NAME = "texlive-mpcolornames-doc-2026.226.0.0.20svn23252-61.2.noarch.rpm"
RPM_HASH = "cd1b710a4554ffdcb2cd16e4e523724072e6c4f8548a268b25463526e6e54e6503718167bdac6799b7b46fc5361c746dfca93842b1168b7cecaf1e6e13091a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpcolornames-doc"

RDEPENDS:${PN} += ""

inherit rpm
