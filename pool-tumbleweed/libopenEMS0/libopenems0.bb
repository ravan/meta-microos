SUMMARY = "Electromagnetic field solver library"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method library."
LICENSE = "GPL-3.0-only"

PV = "0.0.36"

RPM_NAME = "libopenEMS0-0.0.36-4.8.aarch64.rpm"
RPM_HASH = "cf540539a88ee782d05111f8a5c8223870a528d7175b06102ae217841b0b0889a93c639c479984b5baff640dab088ccb90b1c73c9b8500bb30ca6309ebfbc52f"

RPROVIDES:${PN} += "libopenEMS.so.0 \
libopenEMS0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCSXCAD.so.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libfparser-4.5.2.so \
libgcc-s.so.1 \
libhdf5.so.310 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml.so.0 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkIOCore.so.1 \
libvtkIOLegacy.so.1 \
libvtkIOXML.so.1 \
libvtksys.so.1"

inherit rpm
