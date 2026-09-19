SUMMARY = "Tools from libpequality, a library for password quality checking"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks. \
 \
This package contains simple tools that use libpwquality."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality-tools-1.4.5-5.9.aarch64.rpm"
RPM_HASH = "2b071b5101bb07c750684e5130794cd9f844e01ed7e0f004e853fca8aad98b4895a4ff41d4d1e247dd6aa1fe1d40fb92220e18d612c48225b3244956db7dc18d"

RPROVIDES:${PN} += "libpwquality-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpwquality.so.1"

inherit rpm
