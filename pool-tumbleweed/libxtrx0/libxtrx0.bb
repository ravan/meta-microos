SUMMARY = "High level XTRX API"
DESCRIPTION = "High level API for XTRX software defined radio frontends."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrx0-0.0.0+git.20201202-6.3.aarch64.rpm"
RPM_HASH = "ae01dbc3691a6aa0f43f201c270bd20f3b15f91752a430040b96c125161ef8296890a3bf693d080621ec66ad4ef64d3f550d093ed271738f69fedd406bd527f4"

RPROVIDES:${PN} += "libxtrx.so.0 \
libxtrx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblms7compact.so.0 \
libxtrxdsp.so.0 \
libxtrxll.so.0"

inherit rpm
