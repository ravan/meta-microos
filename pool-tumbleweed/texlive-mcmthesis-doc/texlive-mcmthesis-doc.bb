SUMMARY = "Documentation for texlive-mcmthesis"
DESCRIPTION = "This package includes the documentation for texlive-mcmthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.6.3.3svn69538"

RPM_NAME = "texlive-mcmthesis-doc-2026.226.6.3.3svn69538-59.2.noarch.rpm"
RPM_HASH = "6d7de8ed427ab374ca342d82b6c60f35cbbe266fdb25ebab277dd6b526fa0cdbce10170ddf7e24ac2d2f2c6a67fee9687959a5c3e442a073ccfd3ea9cc05ac37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-mcmthesis-doc-zh \
texlive-mcmthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
