SUMMARY = "Tools for wcslib"
DESCRIPTION = "This package contains tools for working with files created or \
opened with wcslib."
LICENSE = "LGPL-3.0-or-later"

PV = "8.6"

RPM_NAME = "wcslib-tools-8.6-1.3.aarch64.rpm"
RPM_HASH = "31c429fa8de8ad095a7638c4211ddb745219127d5a5daece9d784ee8685f1d4f9378e370c0393c3c8494385e3b76f8ea9eaf8f8feab1c16bbfb1f384aaa0b4bc"

RPROVIDES:${PN} += "libwcs-tools \
wcslib-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libm.so.6 \
libwcs8"

inherit rpm
