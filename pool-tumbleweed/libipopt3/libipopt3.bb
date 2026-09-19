SUMMARY = "A software package for large-scale nonlinear optimization methods"
DESCRIPTION = "Ipopt (Interior Point OPTimizer, pronounced eye-pea-Opt) is a software \
package for large-scale nonlinear optimization."
LICENSE = "EPL-2.0"

PV = "3.14.19"

RPM_NAME = "libipopt3-3.14.19-1.7.aarch64.rpm"
RPM_HASH = "f407d0101d3ebb6456c7bf8c929ceb684e1759bfd56cf0481735c8a9e983e87e8dd260820ac4616dea56fa03b5cc92041e4297458c1affb6243a21746e293c82"

RPROVIDES:${PN} += "libipopt.so.3 \
libipopt3 \
libsipopt.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libdmumps-seq.so.5.3.5 \
libgcc-s.so.1 \
liblapack.so.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
