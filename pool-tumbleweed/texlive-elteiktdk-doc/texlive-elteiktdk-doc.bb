SUMMARY = "Documentation for texlive-elteiktdk"
DESCRIPTION = "This package includes the documentation for texlive-elteiktdk"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn71086"

RPM_NAME = "texlive-elteiktdk-doc-2026.226.2.1svn71086-61.4.noarch.rpm"
RPM_HASH = "b65a2d887b4fca530f7bfeecbba3097b593749900a51775e2bde9f2dfb1de3216209d12093999cdcf3a417c491374e2901a93a1fc71dfcb492b85ae532d55fa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-elteiktdk-doc-en;hu \
texlive-elteiktdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
