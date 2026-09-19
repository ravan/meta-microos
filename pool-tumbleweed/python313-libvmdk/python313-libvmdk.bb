SUMMARY = "Library to access the VMware Virtual Disk (VMDK) format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "python313-libvmdk-20260714-1.2.aarch64.rpm"
RPM_HASH = "9ea2814fc4d5fbe72cb6e5267fbe53273cea46f21648e69246939991f9ad57c8925f54f626dce1ac79e2f405f3e7554fded56b7e8c768c5a9a549144a24e4c51"

RPROVIDES:${PN} += "python3-libvmdk \
python313-libvmdk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvmdk.so.1 \
python-abi"

inherit rpm
