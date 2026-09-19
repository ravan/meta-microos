SUMMARY = "Development files for libsbc1"
DESCRIPTION = "Development files for the SBC library."
LICENSE = "GPL-2.0-or-later"

PV = "2.2"

RPM_NAME = "sbc-devel-2.2-1.3.aarch64.rpm"
RPM_HASH = "148fa1ca3a16b64fd0aaf18b79436c007b25abad7f0ea8d7e532c1565bb3d1f94040db705fd16cf4727683a6db110c1f5026c3a534b1b3e8809b4bb4e9c4cdab"

RPROVIDES:${PN} += "pkgconfig-sbc \
sbc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsbc1"

inherit rpm
