SUMMARY = "LG based arm64 systems"
DESCRIPTION = "Device Tree files for LG based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-lg-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "c1e711b05a9a1529da995297f1bc1ea597d2f2e248533a26fc6f2998bfa4192337fab20bd13edc810e3dc27cf6e777e91a0cdf0a6e9ea2910678d7c72d3ddf78"

RPROVIDES:${PN} += "dtb-lg \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
