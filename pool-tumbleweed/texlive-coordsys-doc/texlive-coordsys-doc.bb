SUMMARY = "Documentation for texlive-coordsys"
DESCRIPTION = "This package includes the documentation for texlive-coordsys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn15878"

RPM_NAME = "texlive-coordsys-doc-2026.226.1.4svn15878-61.2.noarch.rpm"
RPM_HASH = "eef5baeec08d1074f4554e35bcb9cb52f3426bba45e39b41b10d9fdded73bf452fe39580433f49cd9e5a92b6e39a11415e091d45081fde87a2d09eb074c148f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coordsys-doc"

RDEPENDS:${PN} += ""

inherit rpm
