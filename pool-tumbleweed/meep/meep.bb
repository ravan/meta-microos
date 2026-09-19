SUMMARY = "FDTD finite-difference time-domain solver"
DESCRIPTION = "Meep (or MEEP) is a free finite-difference time-domain (FDTD) \
simulation software package developed at MIT to model electromagnetic \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "meep-1.28.0-1.12.aarch64.rpm"
RPM_HASH = "901cafa613e53a101f814ee2b8f15adfc8a3334314e9a6e44973fccc488e1de8a07c8de5de98ee12305b8808c6cd194613bfce3961e58a551bd82eb767683a15"

RPROVIDES:${PN} += "meep"

RDEPENDS:${PN} += "guile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctl-devel \
libctl.so.7 \
libgcc-s.so.1 \
libguile-3.0.so.1 \
libm.so.6 \
libmeep.so.32 \
libstdc++.so.6"

inherit rpm
