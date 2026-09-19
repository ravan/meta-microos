SUMMARY = "Library files for inotify-tools"
DESCRIPTION = "inotify is a kernel facility to watch file system changes. This \
package provides some tools for it."
LICENSE = "GPL-2.0-only-with-Linux-syscall-note & GPL-2.0-or-later"

PV = "4.25.9.0"

RPM_NAME = "libinotifytools0-4.25.9.0-1.4.aarch64.rpm"
RPM_HASH = "b6b77da63e9030ea7edea90c5d340decd78d36b7e9af71e216ee223eb2a1069b76f0bf3ca8749f30e2feefd95bf972e743c3ab1c6871eb017004c6901cd8f268"

RPROVIDES:${PN} += "libinotifytools.so.0 \
libinotifytools0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
