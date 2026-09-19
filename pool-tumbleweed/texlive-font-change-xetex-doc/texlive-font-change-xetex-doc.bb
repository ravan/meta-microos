SUMMARY = "Documentation for texlive-font-change-xetex"
DESCRIPTION = "This package includes the documentation for texlive-font-change-xetex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2016.1svn40404"

RPM_NAME = "texlive-font-change-xetex-doc-2026.226.2016.1svn40404-60.2.noarch.rpm"
RPM_HASH = "baebc8dd506d59d0ca012fb273b2261cb1f96cd9385946d80e3980a1800a42f34004f6a1bdac8ab21bec0f21fd825bde8a653426aebb2e25fb9ae2120c512a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-font-change-xetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
