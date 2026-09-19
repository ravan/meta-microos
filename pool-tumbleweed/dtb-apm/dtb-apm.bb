SUMMARY = "AppliedMicro based arm64 systems"
DESCRIPTION = "Device Tree files for AppliedMicro based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-apm-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "17efd005154d03a163a1fe8182bd890db3c13ff3d8e7a7bb571a1b4d559ced6d53265db9a53c13536c01625113c798dd55bf0cd128de01dd33ec12144210a2cb"

RPROVIDES:${PN} += "dtb-apm \
dtb-apm-mustang \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
