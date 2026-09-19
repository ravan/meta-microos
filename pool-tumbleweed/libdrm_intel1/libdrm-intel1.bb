SUMMARY = "Userspace interface for Kernel DRM services for Intel chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for Intel chips."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm_intel1-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "83606248702a53072d539b4932c62a9afe4878c07064b4d8e75c6b198c25a7e791cb8fa6ad41d96254119432abddf0f9cce736af82debd3ff8c8f88451513e8d"

RPROVIDES:${PN} += "libdrm-intel.so.1 \
libdrm-intel1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libpciaccess.so.0"

inherit rpm
