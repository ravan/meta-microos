SUMMARY = "A dynamic library bundling a Linux kernel in a convenient storage format"
DESCRIPTION = " \
libkrunfw is a library bundling a Linux kernel in a dynamic library \
in a way that can be easily consumed by libkrun. \
By having the kernel bundled in a dynamic library, libkrun can leave to \
the linker the work of mapping the sections into the process, and then \
directly inject those mappings into the guest without any kind of additional \
work nor processing."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "5.5.0"

RPM_NAME = "libkrunfw5-5.5.0-2.1.aarch64.rpm"
RPM_HASH = "72c53a5492f5050cd1fa70361f24a43b1d3f92e51fb9cf00075a416d766b17f8501938c0c1e641f8b6ca8d9b98a3f0f962f0645497644cba78d92ec6ff07884c"

RPROVIDES:${PN} += "libkrunfw.so.5 \
libkrunfw4 \
libkrunfw5"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
