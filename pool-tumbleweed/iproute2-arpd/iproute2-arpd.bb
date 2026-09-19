SUMMARY = "Userspace ARP daemon"
DESCRIPTION = "The arpd daemon collects gratuitous ARP information, saving it on \
local disk and feeding it to the kernel on demand to avoid redundant \
broadcasting due to limited standard size (512..1024 entries, \
depending on type) of the kernel ARP cache."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "iproute2-arpd-7.2-1.1.aarch64.rpm"
RPM_HASH = "80b638d74c2b0aaffb2e94e7e53d198f4b42a412553c281e276bc13219116a04e8f53e55b4ca7a7260c0a2e0d9ad79ce3074581cd3ce70f8b2af8b0884d3614a"

RPROVIDES:${PN} += "iproute2-/usr/sbin/arpd \
iproute2-arpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so"

inherit rpm
