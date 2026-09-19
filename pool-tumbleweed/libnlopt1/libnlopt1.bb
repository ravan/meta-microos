SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.1-or-later"

PV = "2.11.0"

RPM_NAME = "libnlopt1-2.11.0-1.3.aarch64.rpm"
RPM_HASH = "50ea9fda21681956ae3e4b01817b422bcc6164af22c4afb7fcb03e19da6868f3a7b88f729edb83b02ccbc7d4287e2be08f6ed214c3f4e3b6aa668bf5359cec38"

RPROVIDES:${PN} += "libnlopt.so.1 \
libnlopt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
