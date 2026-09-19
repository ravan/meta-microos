SUMMARY = "MediaTek based arm64 systems"
DESCRIPTION = "Device Tree files for MediaTek based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-mediatek-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "6b97a06711a373569860b33127606365e2fc3447adb5081ac20946c2cac9a8104cc9c8e0f99cba1c465f01bd836bc0b0b5187fe0a20361152f0c913e6b9e5ea4"

RPROVIDES:${PN} += "dtb-mediatek \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
