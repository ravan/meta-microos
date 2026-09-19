SUMMARY = "Modifies the dynamic library load path of compiled programs and libraries"
DESCRIPTION = "Chrpath allows you to modify the dynamic library load path (rpath and \
runpath) of compiled programs. Currently, only removing and modifying the \
rpath is supported. It cannot extend or add an rpath."
LICENSE = "GPL-2.0-or-later"

PV = "0.18"

RPM_NAME = "chrpath-0.18-1.5.aarch64.rpm"
RPM_HASH = "8cbccebca60ce0c16753b2c22e3713275bbbdf8ccf1f0835fea41515a56dedbf8f85072b39788ad302fb27c6d6e57b073d287c96eaf486f16874781f02a085c0"

RPROVIDES:${PN} += "chrpath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
