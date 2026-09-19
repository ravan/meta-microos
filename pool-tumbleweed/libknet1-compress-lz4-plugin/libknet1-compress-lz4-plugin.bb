SUMMARY = "Provides libknet1 lz4 and lz4hc support"
DESCRIPTION = "Provides lz4 and lz4hc compression support for libknet1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-compress-lz4-plugin-1.33-2.2.aarch64.rpm"
RPM_HASH = "05388430d849a3519903ea943c30429dc88722ddf2f3e26b334eb29d319ed8744073da326680a490dfe4aa675090b2b607017f6684874515ec458cf493e166f2"

RPROVIDES:${PN} += "libknet1-compress-lz4-plugin"

RDEPENDS:${PN} += "libc.so.6 \
libknet1 \
liblz4.so.1"

inherit rpm
