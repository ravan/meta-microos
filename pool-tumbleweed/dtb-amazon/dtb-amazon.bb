SUMMARY = "Amazon based arm64 systems"
DESCRIPTION = "Device Tree files for Amazon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-amazon-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "3909714c90ae1dda9cd245a8ec2258accf22b042b8a02295d6b43a5a125eedaf7f2ea06e0bb2a45b967e880cf1ab6a5edb4aaf06f46813bb4d74389c0faee811"

RPROVIDES:${PN} += "dtb-al \
dtb-amazon \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
