SUMMARY = "An implementation of the GDAL data model"
DESCRIPTION = "KEALib provides an implementation of the GDAL data model."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "libkea1_6-1.6.2-1.3.aarch64.rpm"
RPM_HASH = "dd23e1e62a389f4cd25cf317ee75aecfe09b12c43b16d66782a7e40aac622b269238855be46b7ffd8b69b91fbab650bc9badce3bb9ee52d5424f6c302c1b3164"

RPROVIDES:${PN} += "libkea.so.1.6 \
libkea1-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-cpp.so.310 \
libhdf5.so.310 \
libstdc++.so.6"

inherit rpm
