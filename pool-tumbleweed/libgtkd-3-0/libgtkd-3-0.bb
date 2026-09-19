SUMMARY = "GtkD base library"
DESCRIPTION = "This package contains the GtkD base library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libgtkd-3-0-3.9.0-3.10.aarch64.rpm"
RPM_HASH = "9eeab6b823a224065f333764a284ccbdc54267075121ad101c80d657ab4391efb5ef3e19b9b2929f60db5038600998e957f96f02a4d453e2b5d63400e28923d0"

RPROVIDES:${PN} += "libgtkd-3-0 \
libgtkd-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1 \
libphobos2-ldc-shared.so.112"

inherit rpm
