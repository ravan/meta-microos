SUMMARY = "XFS support for libguestfs"
DESCRIPTION = "This adds XFS support to libguestfs.  Install it if you want to process \
disk images containing XFS."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-xfs-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "20daddf5e3641e34b0e70020b3c78c464dbac6d1f1f8d25926ffdc929572ecb9de925efd65e722f7a0f470a0a47c5e255dc463561b4923d33513f2e04cfc0d33"

RPROVIDES:${PN} += "libguestfs-xfs"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
