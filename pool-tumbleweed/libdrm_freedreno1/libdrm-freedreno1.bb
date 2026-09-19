SUMMARY = "Userspace interface to kernel DRM services for Qualcomm Adreno chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Qualcomm Adreno chips."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm_freedreno1-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "38b25abc4b59481b48b0aea7e6073f0506238e230b467df8f9a3213b3cd30f198d993ad5796f02a9ba7e2eaf27256c48ff4142d665d0ba01815a5115cc8fecd6"

RPROVIDES:${PN} += "libdrm-freedreno.so.1 \
libdrm-freedreno1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
