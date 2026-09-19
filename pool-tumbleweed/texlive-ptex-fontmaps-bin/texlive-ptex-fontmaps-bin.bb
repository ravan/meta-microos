SUMMARY = "Binary files of ptex-fontmaps"
DESCRIPTION = "Binary files of ptex-fontmaps"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn44206"

RPM_NAME = "texlive-ptex-fontmaps-bin-2026.20260301.svn44206-120.4.aarch64.rpm"
RPM_HASH = "1efea2a74448390d6879dd8198f91ab78a98fcfda3638450f1dc9dd5ca0e34bd09ca6dfeb395abf9f8820d120c9b952681dfca2c6ed8d82da1ede35d45481a1a"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-bin"

RDEPENDS:${PN} += "texlive-ptex-fontmaps"

inherit rpm
