SUMMARY = "AMD based arm64 systems"
DESCRIPTION = "Device Tree files for AMD based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-amd-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "a86d5c52b9bfcde5c50daa41ffab83cd34ee65c1dc3b103a5a8f5839ee9a0e00b40d1904615819064025b72f41837da159c1ba2e6ecf5fa271cc1c6d8f3d55c8"

RPROVIDES:${PN} += "dtb-amd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
