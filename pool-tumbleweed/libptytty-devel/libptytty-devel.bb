SUMMARY = "Development files for libptytty"
DESCRIPTION = "libptytty is an offspring of rxvt-unicode that handles \
pty/tty/utmp/wtmp/lastlog handling in mostly OS-independent ways. \
 \
This package contains the libptytty development files."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "libptytty-devel-2.0-2.18.aarch64.rpm"
RPM_HASH = "afec37f08c0452bbcd7c6d779907f3ad6928f6769d9c307219a4196dbeceb93b3050cf0d5fe3296fbed22d6eaeae43cf7b045e00eb9b8889abe9bd89b988ab50"

RPROVIDES:${PN} += "libptytty-devel \
pkgconfig-libptytty"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptytty0"

inherit rpm
