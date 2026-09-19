SUMMARY = "Library for old termcap"
DESCRIPTION = "This library of old termcap"
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8"

RPM_NAME = "libtermcap2-2.0.8-1050.6.aarch64.rpm"
RPM_HASH = "6a985cb5533303b1096ee9269cc6b541c2659c015c8e54dfc63190936f37e354567ad00748c4cb2b613daa86fc08f90d7f16f97a9b132f46c3bb87e429b6d3aa"

RPROVIDES:${PN} += "libtermcap.so.2 \
libtermcap2 \
termcap-/usr/lib64/libtermcap.so.2.0.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
