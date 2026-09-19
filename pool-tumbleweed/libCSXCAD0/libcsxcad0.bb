SUMMARY = "A C++ library to describe geometrical objects and their properties"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.3"

RPM_NAME = "libCSXCAD0-0.6.3-5.1.aarch64.rpm"
RPM_HASH = "a5821a0e5f6fdba22b18eb6ce4d6c072ebd49ef60e96bb4f5be265076f48390132e8ebeb23ec51cba7a2f1bbad262e3ae22eee24620058790bdf3dfa7d553031"

RPROVIDES:${PN} += "libCSXCAD.so.0 \
libCSXCAD0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libfparser-4.5.2.so \
libgcc-s.so.1 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml.so.0 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonMath.so.1 \
libvtkIOGeometry.so.1 \
libvtkIOPLY.so.1 \
libvtksys.so.1"

inherit rpm
