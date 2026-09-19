SUMMARY = "Userspace interface for Kernel DRM services for AMD Radeon chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for AMD Radeon chips."
LICENSE = "MIT"

PV = "2.4.134"

RPM_NAME = "libdrm_amdgpu1-2.4.134-2.2.aarch64.rpm"
RPM_HASH = "ecc25ce4ff0f04da22da7e57296e28e9668759b3c86ec48dab8e321b860a66bc886ca55a38b93dd8ac42cad2cbf506a7382b923e6c3c312695992c9e963a8991"

RPROVIDES:${PN} += "libdrm-amdgpu.so.1 \
libdrm-amdgpu1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
