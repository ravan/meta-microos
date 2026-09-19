SUMMARY = "Tool to work with symmetric polyhedra"
DESCRIPTION = "SymPol is a C++ tool to work with symmetric polyhedra. It helps to \
compute restricted automorphisms (parts of the linear symmetry group) \
of polyhedra and performs polyhedral description conversion up to a \
given or computed symmetry group."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9"

RPM_NAME = "sympol-0.1.9-3.9.aarch64.rpm"
RPM_HASH = "cb63ef47c59e4a235db03dc893b36aa725f39276785ba998abbf3551abd472c68b351faa65cc0f368b4c4785d47b5b3e6c7f319a9e7ed6fbea31dff84ff0f03c"

RPROVIDES:${PN} += "sympol"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libstdc++.so.6 \
libsympol.so.0.1"

inherit rpm
