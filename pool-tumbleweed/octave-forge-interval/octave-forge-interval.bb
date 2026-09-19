SUMMARY = "Real-valued interval arithmetic for Octave"
DESCRIPTION = "The interval package for real-valued interval arithmetic allows to \
evaluate functions over subsets of their domain.  All results are verified, \
because interval computations automatically keep track of any errors. \
 \
These concepts can be used to handle uncertainties, estimate arithmetic errors \
and produce reliable results.  Also it can be applied to computer-assisted \
proofs, constraint programming, and verified computing. \
 \
The implementation is based on interval boundaries represented by binary64 \
numbers and is conforming to IEEE Std 1788-2015, IEEE standard for interval \
arithmetic. \
 \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "octave-forge-interval-3.2.1-2.5.aarch64.rpm"
RPM_HASH = "bab0fe623749a22a2d0075130a8987261a6290058768740d31078127196edfede670a85d50279f81bdec105afa4481f4f17274c6ad9a0ef3b5beb1603ec2da70"

RPROVIDES:${PN} += "octave-forge-interval"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
