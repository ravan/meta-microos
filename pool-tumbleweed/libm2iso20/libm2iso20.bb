SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "15.3.0+git11272"

RPM_NAME = "libm2iso20-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "9659392b688ee407091fd1185e8b7bdf8b9fe5366f3cd4f937757a26b20f1c153538783f29b3a59957c9bf6eea987aa1006bd76d3285f94b924a538e24dac654"

RPROVIDES:${PN} += "libm2iso.so.20 \
libm2iso20"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
