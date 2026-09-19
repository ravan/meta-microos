SUMMARY = "Stand-alone libusrp for USRP1 from old gnuradio.git"
DESCRIPTION = "Stand-alone libusrp for USRP1 from old gnuradio.git."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.11"

RPM_NAME = "libusrp1-3.4.11-1.4.aarch64.rpm"
RPM_HASH = "b971a7eb8552a5054945871e088d5a9cc8dce8be5f7ecf790ad6e0fd1b15b369f28627b011011d758f92ebfcce3d06102179eef15c760e786f6b349062e30378"

RPROVIDES:${PN} += "libusrp.so.1 \
libusrp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
