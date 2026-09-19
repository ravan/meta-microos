SUMMARY = "Quake III"
DESCRIPTION = "Quake III development tools for creating mods: q3lcc, q3rcc, q3cpp, \
q3asm"
LICENSE = "GPL-2.0-or-later"

PV = "1.36+git.20250612"

RPM_NAME = "ioquake3-devel-1.36+git.20250612-1.5.aarch64.rpm"
RPM_HASH = "1d2955dfb9cfc6ae7f5b94685f2c2bca401b2950b495958545910bbb769d422b8bc0f1a27a74e741472aef2aabc17d3235ed086379b0e91245ab0f56ed831a91"

RPROVIDES:${PN} += "ioquake3-devel"

RDEPENDS:${PN} += ""

inherit rpm
