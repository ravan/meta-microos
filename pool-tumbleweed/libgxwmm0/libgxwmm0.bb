SUMMARY = "Guitarix runtime library"
DESCRIPTION = "guitarix is a simple mono amplifier to jack with one input and two \
outputs."
LICENSE = "GPL-2.0-or-later"

PV = "0.47.0"

RPM_NAME = "libgxwmm0-0.47.0-2.3.aarch64.rpm"
RPM_HASH = "6dc22893c5557a0ca567acaa82bc3101fe5338dc0d63a73786fa0f36ad836e3860ab46f68b9f2de8e667ce39925ab994b20585a07faa93f0f34937e1762d56b7"

RPROVIDES:${PN} += "libgxwmm.so.0 \
libgxwmm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtkmm-3.0.so.1 \
libgxw.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
