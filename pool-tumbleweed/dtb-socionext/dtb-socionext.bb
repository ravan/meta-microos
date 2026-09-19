SUMMARY = "Socionext based arm64 systems"
DESCRIPTION = "Device Tree files for Socionext based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-socionext-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "72522d3dd29d91d4ddd95ac70a530bec93510ca4ff19acb3ce23bd67c763954ca18eea69ebd1f4b6542c572f472b191cc8a2227aaf8b06be0554d1ae2b5dc718"

RPROVIDES:${PN} += "dtb-socionext \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
