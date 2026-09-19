SUMMARY = "XFS Filesystem-specific Static Libraries and Headers"
DESCRIPTION = "xfsprogs-devel contains the libraries and header files needed to \
develop XFS file system-specific programs. \
 \
You should install xfsprogs-devel if you want to develop XFS file \
system-specific programs.  If you install xfsprogs-devel, you will also \
want to install xfsprogs."
LICENSE = "GPL-2.0-or-later"

PV = "6.19.0"

RPM_NAME = "xfsprogs-devel-6.19.0-1.5.aarch64.rpm"
RPM_HASH = "aa55ede16f0b0911f3d5269e323015a47e65a893b73df1cecfcb7356db2de68232cc86876805f011eeffc325e1f23abaf271bd3e9489eb9f71b8e9ead6ed5901"

RPROVIDES:${PN} += "xfsprogs-devel"

RDEPENDS:${PN} += "libhandle1 \
libuuid-devel \
xfsprogs"

inherit rpm
