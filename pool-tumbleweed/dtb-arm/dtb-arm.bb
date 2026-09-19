SUMMARY = "ARM Ltd. based arm64 systems"
DESCRIPTION = "Device Tree files for ARM Ltd. based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-arm-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "c0d3827e7f0c51e99742e9764f754fa5ce4850b30f79370968beb7129792e79ad3fede608e1aa10ffbaf7c0a8bbca0269d9daaeba6d57da3669eacc01c9b9aa5"

RPROVIDES:${PN} += "dtb-arm \
dtb-foundation-v8 \
dtb-rtsm-ve-aemv8a \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
