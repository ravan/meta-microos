SUMMARY = "Renesas based arm64 systems"
DESCRIPTION = "Device Tree files for Renesas based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-renesas-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "ae1d3fce77bda8dcf2450c823c9c73aa533ccbd2955105add948c12e43edcbcd447d3a15f6e4b637c376f82232ba620c10bc68e86b5fc803d76b5b8f0ebb6464"

RPROVIDES:${PN} += "dtb-renesas \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
