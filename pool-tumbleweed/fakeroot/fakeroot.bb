SUMMARY = "Wrapper that gives a fake root environment"
DESCRIPTION = "fakeroot runs a command in an environment wherein it appears to have \
root privileges for file manipulation. fakeroot works by replacing the \
file manipulation library functions (chmod(2), stat(2) etc.) by ones \
that simulate the effect the real library functions would have had, \
had the user really been root."
LICENSE = "GPL-3.0-or-later"

PV = "1.38"

RPM_NAME = "fakeroot-1.38-1.2.aarch64.rpm"
RPM_HASH = "6027ad17aaf4777846b892826c606d98c9cd5daafa3809e049f7d697b0d93dc5adff1243a4f3b3f3c2f87084d25572f2335fb6ce0dc64fa73481972e344b45b0"

RPROVIDES:${PN} += "fakeroot \
libfakeroot-0.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
