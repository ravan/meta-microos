SUMMARY = "Amlogic based arm64 systems"
DESCRIPTION = "Device Tree files for Amlogic based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-amlogic-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "cf636361ecc286e6eae396ca33ad17075c97390f29da27e38faeb410fb3281f262e72c3fc698bc361eb5e174551482555d9ea9943ae25617f96613ed55654e4c"

RPROVIDES:${PN} += "dtb-amlogic \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
