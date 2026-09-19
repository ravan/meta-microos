SUMMARY = "Tools for inotify"
DESCRIPTION = "inotify is a kernel facility to watch file system changes. This \
package provides some tools for it."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later"

PV = "4.25.9.0"

RPM_NAME = "inotify-tools-4.25.9.0-1.4.aarch64.rpm"
RPM_HASH = "226744015578454a8dc124b142a46537dcde5d485c5e0d1325c88abb6fabd1288a308b2c616e56768a2522c8edaa41f0d1813badf84084206e2eb8990edb46f6"

RPROVIDES:${PN} += "inotify-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libinotifytools.so.0"

inherit rpm
