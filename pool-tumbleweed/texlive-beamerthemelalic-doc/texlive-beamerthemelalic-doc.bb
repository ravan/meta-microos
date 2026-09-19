SUMMARY = "Documentation for texlive-beamerthemelalic"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemelalic"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn58777"

RPM_NAME = "texlive-beamerthemelalic-doc-2026.226.1.0svn58777-61.2.noarch.rpm"
RPM_HASH = "1836151907833366a53638d737c2d07df538c05e54ab359adeaa7060f18ce63428dc4ae8e85279eca691886bac0af69fb3827b4493a78c1c83574ead64aae3be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemelalic-doc"

RDEPENDS:${PN} += ""

inherit rpm
