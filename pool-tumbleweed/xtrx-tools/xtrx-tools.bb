SUMMARY = "Tools for XTRX"
DESCRIPTION = "Tools for XTRX SDR devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrx-tools-0.0.0+git.20201202-6.3.aarch64.rpm"
RPM_HASH = "e978faa2dbbf45dc6b3fe27b77e8c75ed2100b3e63089eb3fe028f7a048258b426ef45f27e19c8e9722a11a30447c0b34ed8e3dcb6b784b5f2904a4e96541b76"

RPROVIDES:${PN} += "xtrx-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libxtrx.so.0 \
soapysdr0.8-3-module-xtrx"

inherit rpm
