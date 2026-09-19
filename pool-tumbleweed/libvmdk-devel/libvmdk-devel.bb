SUMMARY = "Header files and libraries for developing applications for libvmdk"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format. \
 \
See libvmdk for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvmdk."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "libvmdk-devel-20260714-1.2.aarch64.rpm"
RPM_HASH = "acf487952636e7c8e5086bc53eb89c9033de5bf40493cd26ee38a9610a70d36da4c5d6bda807593d391627bc1a6981d6efc6a799e584ce4ca34bb188990d95a0"

RPROVIDES:${PN} += "libvmdk-devel \
pkgconfig-libvmdk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvmdk1"

inherit rpm
