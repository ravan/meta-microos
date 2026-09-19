SUMMARY = "Tools to access the VMDK image format"
DESCRIPTION = "Several tools for accessing VMware Virtual Disk (VMDK) files. \
 \
See libvmdk for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20260714"

RPM_NAME = "libvmdk-tools-20260714-1.2.aarch64.rpm"
RPM_HASH = "a50c149e3ee35b7cec180e4929f3cb3b48ff7373d35d9fb87645eac030a3e8342444d9dfe95b4596a5d8a24095bb1ab1c9891282ff3f8d730462ae95575e89d1"

RPROVIDES:${PN} += "libvmdk-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfuse3.so.4 \
libvmdk.so.1"

inherit rpm
