SUMMARY = "XTRXDSP library"
DESCRIPTION = "DSP specific functions for SDR in general and XTRX in specific."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190830"

RPM_NAME = "libxtrxdsp0-0.0.0+git.20190830-2.16.aarch64.rpm"
RPM_HASH = "42b294e609012b2c02f048cc673c5e01dd93e51937a86acb20b2cadb25c73f0943d56ee8f3e7f0608fd5ffb2461a774521d4d6509e511433bccb86fc9fa4f7c6"

RPROVIDES:${PN} += "libxtrxdsp.so.0 \
libxtrxdsp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
