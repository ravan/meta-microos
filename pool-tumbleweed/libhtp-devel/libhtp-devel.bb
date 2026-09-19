SUMMARY = "Development files for libhtp"
DESCRIPTION = "The libhtp-devel package contains libraries and header files for \
developing applications that use libhtp."
LICENSE = "BSD-3-Clause"

PV = "0.5.53"

RPM_NAME = "libhtp-devel-0.5.53-1.1.aarch64.rpm"
RPM_HASH = "0c202cfaf733d3becc50ab2e9b1149c24b353dc9c1cc67a1184f0dd0705d628aa585b584fa5e18b02955464ebc1db7d303b4f7fad8d76e8cf89d7aaf051e9f55"

RPROVIDES:${PN} += "libhtp-devel \
pkgconfig-htp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhtp2"

inherit rpm
