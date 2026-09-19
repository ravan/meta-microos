SUMMARY = "A plug-in framework for C++"
DESCRIPTION = "C-Pluff is a plug-in framework for C++ programs."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "libcpluffxx0-0.2.1-1.5.aarch64.rpm"
RPM_HASH = "d69f9295b2ebe8fd4f86c5031d6e0c1288cdbf4c228c7c5d574286a7db1df0260393059ac72d5f809d1a7798b9991cbf13382ac1fcb50f1f804fd6406a11ab46"

RPROVIDES:${PN} += "libcpluffxx.so.0 \
libcpluffxx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcpluff.so.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
