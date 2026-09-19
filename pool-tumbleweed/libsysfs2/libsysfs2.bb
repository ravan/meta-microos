SUMMARY = "Library for interfacing with the kernel's sysfs filesystem"
DESCRIPTION = "This package's purpose is to provide a library for interfacing with the \
kernel's sys filesystem mounted at /sys. The library was an attempt to \
create a stable interface to sysfs, but it failed. It is still provided \
for the current users, but no new software should use this library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.1"

RPM_NAME = "libsysfs2-2.1.1-1.18.aarch64.rpm"
RPM_HASH = "aaca8a56771030a7e557df3e874ebe57da6ba812d07d1b35c040758c6fd6fbe258e94f9d62ac4d31c9cb69015df317763ae3e386723c5780aef88d09a48b4f6f"

RPROVIDES:${PN} += "libsysfs.so.2 \
libsysfs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
