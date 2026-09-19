SUMMARY = "Core partio libraries"
DESCRIPTION = "C++ (with python bindings) library for easily reading/writing/manipulating \
common animation particle formats such as PDB, BGEO, PTC."
LICENSE = "BSD-3-Clause"

PV = "1.20.0"

RPM_NAME = "libpartio1-1.20.0-1.4.aarch64.rpm"
RPM_HASH = "cc6e66cfbf81dd464e66e31835bffff13d06011c09bb50dad34e3808348fcd13270e1b06f7fbd3e6616f47a987516ddd00da328bc887806d15bc5979dbe006ba"

RPROVIDES:${PN} += "libpartio.so.1 \
libpartio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
