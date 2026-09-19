SUMMARY = "Development files for libguestfs"
DESCRIPTION = "Development files for libguestfs. \
 \
libguestfs is a set of tools for accessing and modifying virtual machine (VM) \
disk images. You can use this for viewing and editing files inside guests, \
scripting changes to VMs, monitoring disk used/free statistics, P2V, V2V, \
performing partial backups, cloning VMs, and much else besides."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-devel-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "770521f34d531581adb18f5549a85e26a935b1990b733afb7256ed945ba422423b2e26cc7315a8dc08a988425f33490080f3420b42fc387962dbeddab283174f"

RPROVIDES:${PN} += "libguestfs-devel \
pkgconfig-libguestfs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
libguestfs0"

inherit rpm
