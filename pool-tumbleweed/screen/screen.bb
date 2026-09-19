SUMMARY = "A program to allow multiple screens on a VT100/ANSI Terminal"
DESCRIPTION = "With this program you can take advantage of the multitasking abilities \
of your Linux system by opening several sessions over one terminal. The \
sessions can also be detached and resumed from another login terminal. \
 \
Documentation: man page"
LICENSE = "GPL-3.0-or-later"

PV = "4.9.1"

RPM_NAME = "screen-4.9.1-5.6.aarch64.rpm"
RPM_HASH = "32e9989122b01c445d299159bced98d101433475cccded1ce74b4972192b23650fdf842bdef02732f6e36c82bf65e022e945c7e9171ba61d9db72e9ca5b54596"

RPROVIDES:${PN} += "config-screen \
screen"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libpam.so.0 \
libtinfo.so.6 \
permissions \
terminfo-base"

inherit rpm
