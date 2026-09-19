SUMMARY = "GPT partitioning and MBR repair software"
DESCRIPTION = "Partitioning software for GPT disks and to repair MBR disks. The \
gdisk, cgdisk, and sgdisk utilities (in the gdisk package) are \
GPT-enabled partitioning tools; the fixparts utility (in the fixparts \
package) fixes some problems with MBR disks that can be created by \
buggy partitioning software."
LICENSE = "GPL-2.0-only"

PV = "1.0.10"

RPM_NAME = "gptfdisk-1.0.10-1.9.aarch64.rpm"
RPM_HASH = "9a499308344696a2f0c91de10ac9af4e5bec82786102333e90f88ec3fbd3ff93d1988241ae20643bb06b20be3fdbcd61efe4be4dff06c0c66698724918b21e9b"

RPROVIDES:${PN} += "gdisk \
gptfdisk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libpopt.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libuuid.so.1"

inherit rpm
