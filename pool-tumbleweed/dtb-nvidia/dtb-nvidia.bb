SUMMARY = "Nvidia based arm64 systems"
DESCRIPTION = "Device Tree files for Nvidia based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-nvidia-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "b2d7a3760178629c21d14d0078b7e81f2461edb0366646fc1f5d7cc2467be53b82c7aae425d27e4763f6a4c905105f7f54200753b748179884f97956775b558a"

RPROVIDES:${PN} += "dtb-nvidia \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
