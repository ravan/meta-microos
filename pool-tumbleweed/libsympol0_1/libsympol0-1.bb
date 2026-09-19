SUMMARY = "Library for working with symmetric polyhedra"
DESCRIPTION = "SymPol is a C++ tool to work with symmetric polyhedra. It helps to \
compute restricted automorphisms (parts of the linear symmetry group) \
of polyhedra and performs polyhedral description conversion up to a \
given or computed symmetry group."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9"

RPM_NAME = "libsympol0_1-0.1.9-3.9.aarch64.rpm"
RPM_HASH = "2c052c84e98af9a6f84b2c01a7c190e99e35ad3f3355cc8be011cf0f85577d9888bad6513765c0f633b0dd1755076ee266675980a3911fa6e74dcb3072680018"

RPROVIDES:${PN} += "libsympol.so.0.1 \
libsympol0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbliss.so.0.77 \
libc.so.6 \
libcddgmp.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
liblrs.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
