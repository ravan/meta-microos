SUMMARY = "Documentation for texlive-dviasm"
DESCRIPTION = "This package includes the documentation for texlive-dviasm"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn71902"

RPM_NAME = "texlive-dviasm-doc-2026.226.svn71902-61.4.noarch.rpm"
RPM_HASH = "14d52f5df1fe26dabed8d11e283491b0ba7f60c4c9cfff4636846c1625f1fbb681f7d0e7bd266f267c2bacd2396698319b0c24c2cd62aad7ab8fc3b98feb8ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dviasm.1 \
texlive-dviasm-doc"

RDEPENDS:${PN} += ""

inherit rpm
