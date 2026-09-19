SUMMARY = "Tools to access the VHD image format"
DESCRIPTION = "Tools to access the Virtual Hard Disk (VHD) image format.  See libvhdi for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "libvhdi-tools-20260901-1.1.aarch64.rpm"
RPM_HASH = "c0a25ad0c16d5f5c8639c2ed64c0bd9dab96981a178a609b105afddd5421ab43feea2d094d4f04363847dbef2b551c06b1612a4078f8e204976c9687334c78e7"

RPROVIDES:${PN} += "libvhdi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfguid.so.1 \
libvhdi.so.1"

inherit rpm
