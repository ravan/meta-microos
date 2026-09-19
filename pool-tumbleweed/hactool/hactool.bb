SUMMARY = "Tool to view/extract information about Nintendo Switch Archives"
DESCRIPTION = "hactool is a tool to view information about, decrypt, and extract \
common file formats for the Nintendo Switch, especially Nintendo \
Content Archives."
LICENSE = "ISC"

PV = "1.4.0"

RPM_NAME = "hactool-1.4.0-1.23.aarch64.rpm"
RPM_HASH = "e52656a49242a323f49e79990a1a88c44ff35cd16f4e5b0cf3d0c4570e88d4cbb1a3bbbc4aa955e725bccc13ba81da055dd4946497fdb2d31e4bad309932cf61"

RPROVIDES:${PN} += "hactool"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
