SUMMARY = "C source code complexity computation utility"
DESCRIPTION = "Complexity is a tool for analyzing the complexity of 'C' program functions.  It \
is very similar to the McCabe scoring, but addresses some issues not considered \
in that scoring scheme."
LICENSE = "GPL-3.0-or-later"

PV = "1.13"

RPM_NAME = "complexity-1.13-1.12.aarch64.rpm"
RPM_HASH = "68e4a1f661936fb8238509d3bcc85f101245643edc09ba759ec3f4d0025fcde5fd4f448d33529153182ebe79d3bc7e7937b0be510a84bd4ea4bea8c8473ca6bc"

RPROVIDES:${PN} += "complexity"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopts.so.25"

inherit rpm
