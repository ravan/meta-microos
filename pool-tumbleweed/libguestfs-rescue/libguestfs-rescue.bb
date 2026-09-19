SUMMARY = "Virt-rescue shell"
DESCRIPTION = "This adds the virt-rescue shell which is a 'rescue disk' for virtual \
machines, and additional tools to use inside the shell such as ssh, \
network utilities, editors and debugging utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-rescue-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "b44dd2f6ef5382419312ffa4419d23c005236408abf11492e80dc779335a24a456a005d7767e4ca765c52a1bf3ddd62b1d9bbaa8046e0bfe64962370779bac3f"

RPROVIDES:${PN} += "libguestfs-rescue"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.15 \
libguestfs.so.0 \
libxml2.so.16"

inherit rpm
