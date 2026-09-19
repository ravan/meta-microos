SUMMARY = "Documentation for texlive-esk"
DESCRIPTION = "This package includes the documentation for texlive-esk"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn18115"

RPM_NAME = "texlive-esk-doc-2026.226.1.0svn18115-61.4.noarch.rpm"
RPM_HASH = "9074e207e2c725e8a3f56b67da8ffe1845a0b6c0802a7d178fd0c09c515a615f7437ed558d67cb0b22ed284574cb2d66f7823beae92a4be53107fa9d838e5f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esk-doc"

RDEPENDS:${PN} += ""

inherit rpm
