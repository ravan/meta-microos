SUMMARY = "Source Han Sans variation for Korean"
DESCRIPTION = "Source Han Sans is a pan-CJK typeface in OpenType/CFF and CID forms."
LICENSE = "OFL-1.1"

PV = "2.005"

RPM_NAME = "adobe-sourcehansans-kr-fonts-2.005-1.3.noarch.rpm"
RPM_HASH = "be87d76fe5c6dca81a76fb21508771756596befe8735e9153e6f07f0dc025e1d3d516bbd2e30dcbedb4c6adcd9281da7e79bbf353d8fc88a02670c4e4211259a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-kr-fonts \
locale-kr \
scalable-font-kr"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
