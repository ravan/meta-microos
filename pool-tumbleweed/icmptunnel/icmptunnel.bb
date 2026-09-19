SUMMARY = "A tunnel for wrapping IP traffic in ICMP"
DESCRIPTION = "This program transparently tunnels IP traffic through ICMP echo and reply packets."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "icmptunnel-1.0.0-2.9.aarch64.rpm"
RPM_HASH = "9f81a9dd9e594027c23b3a1742be609479efa3d1567f81ca68bb4b864c434ab2e4a4f90f055093a10fabb0c1ce82427c0e1c7f71900d5f5668b51edba7edab0f"

RPROVIDES:${PN} += "icmptunnel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
