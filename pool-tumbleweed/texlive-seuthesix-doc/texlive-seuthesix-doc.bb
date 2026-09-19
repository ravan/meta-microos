SUMMARY = "Documentation for texlive-seuthesix"
DESCRIPTION = "This package includes the documentation for texlive-seuthesix"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.1svn40088"

RPM_NAME = "texlive-seuthesix-doc-2026.226.1.0.1svn40088-60.2.noarch.rpm"
RPM_HASH = "3d4cddabed8dd60c8976361f8d683c56df5db337458c7641227cf67d34c9b496caf9534373b190060a4a7fb430683dd9419bfce9eaf47204b35d3020bad05cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-seuthesix-doc-zh \
texlive-seuthesix-doc"

RDEPENDS:${PN} += ""

inherit rpm
