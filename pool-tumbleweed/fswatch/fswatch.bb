SUMMARY = "Multi platform file change monitor"
DESCRIPTION = "fswatch is a file change monitor that receives notifications when the contents \
of the specified files or directories are modified. fswatch implements several \
monitors based on: \
 \
 * the File System Events API of Apple macOS. \
 * kqueue, a notification interface introduced in FreeBSD 4.1 (and supported on \
   most *BSD systems, including macOS). \
 * the File Events Notification API of the Solaris kernel and its derivatives. \
 * inotify, a Linux kernel subsystem that reports file system changes to applications. \
 * ReadDirectoryChangesW, a Microsoft Windows API that reports changes to a directory. \
 * A monitor which periodically stats the file system, saves file modification times \
   in memory, and manually calculates file system changes (which works anywhere stat(2) \
   can be used)."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.0"

RPM_NAME = "fswatch-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "1da15f0f4d5f4f528715af06c603200574e942404cee8fc7310e183b7adb515609f82b586d5938bc5cdb89fb3a899d265aed9c1648c18225121569cf3de982e3"

RPROVIDES:${PN} += "fswatch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfswatch.so.15 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
