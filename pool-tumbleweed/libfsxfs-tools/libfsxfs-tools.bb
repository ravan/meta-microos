SUMMARY = "Utilities to inspect SGI X File Systems (XFS)"
DESCRIPTION = "This subpackage provides the utilities from libfsxfs, which allows for \
reading SGI X File Systems (XFS)."
LICENSE = "LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "libfsxfs-tools-20260901-1.1.aarch64.rpm"
RPM_HASH = "bdf0986ac92ce704ff56be60db549402227a91869c4e086a59391556687912bf7cbf777f1c5d83d9009531a4f8981e798d0e1e0ad6e9ae188098e2c4ee6f668a"

RPROVIDES:${PN} += "libfsxfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfsxfs.so.1 \
libfuse3.so.4 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
