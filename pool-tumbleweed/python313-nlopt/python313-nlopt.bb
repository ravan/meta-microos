SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.1-or-later"

PV = "2.11.0"

RPM_NAME = "python313-nlopt-2.11.0-1.4.aarch64.rpm"
RPM_HASH = "9f70bc3481720d8affea54b06d101f8ee3f8754b053cac507ed00bcdabcf5a2e9c20de9f1999e0beff5d94cced21bcb1b5966b92a324fb101fd276d611380fc3"

RPROVIDES:${PN} += "python3-nlopt \
python3.13dist-nlopt \
python313-nlopt \
python3dist-nlopt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnlopt.so.1 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
