SUMMARY = "Rockchip based arm64 systems"
DESCRIPTION = "Device Tree files for Rockchip based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-rockchip-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "c0705e31abb61760bd8c98e0beb6091f1787c0fd36bc6060cbcafea0e946cda2abf54cfc28f9b8428b6fe15081f67dc5ba3296b8b302e07476d72aa0de85bcab"

RPROVIDES:${PN} += "dtb-rockchip \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
