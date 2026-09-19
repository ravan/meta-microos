SUMMARY = "Octave interface to nonlinear optimization library"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms. \
 \
This package contains the Octave interface for NLopt."
LICENSE = "LGPL-2.1-or-later"

PV = "2.11.0"

RPM_NAME = "octave-nlopt_optimize-2.11.0-1.4.aarch64.rpm"
RPM_HASH = "c559cc9fa142204714b901da949cdd278550df67ed796f837b88f1afb08c98e1c2c68aa7cbc4ba8621a87a98fc75ef70e0009de60b8999f44bd2018166d7c873"

RPROVIDES:${PN} += "octave-nlopt-optimize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnlopt.so.1 \
liboctave.so.13 \
liboctinterp.so.15 \
libstdc++.so.6 \
octave-cli"

inherit rpm
