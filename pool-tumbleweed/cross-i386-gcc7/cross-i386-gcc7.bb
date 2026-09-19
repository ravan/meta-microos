SUMMARY = "The GNU Compiler Collection targeting i386"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting i386. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-i386-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "929014f1bdbbf5f2530d54bd13d41314ae73588a905cad0ed30d41717c12754f204048b0e10434138dff7166334c716955fcc7b7c62e26785299217e3fad8646"

RPROVIDES:${PN} += "cross-i386-gcc7 \
i586-suse-linux-gcc \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-i386-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
