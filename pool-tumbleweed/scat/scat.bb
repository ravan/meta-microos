SUMMARY = "Syntax highlight for terminal"
DESCRIPTION = "Cat-like tool with syntax highlighting for terminals."
LICENSE = "GPL-3.0-only"

PV = "0.0.1"

RPM_NAME = "scat-0.0.1-2.17.noarch.rpm"
RPM_HASH = "cb6629d2a225bef7f977fb16484e8cb8ab4c42f925786b725e79d3d08865e23a365594882970240a2a6196ee8e74a91f3e443572112f1801744b0655b7aca434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scat"

RDEPENDS:${PN} += "/usr/bin/bash \
python3-Pygments"

inherit rpm
