SUMMARY = "Tools for MMC/SD devices"
DESCRIPTION = "Userspace tools for controlling and querying MMC/SD storage devices"
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "mmc-utils-1.0-2.3.aarch64.rpm"
RPM_HASH = "200bc9d25d0c410b200f356e577507846bc92f919d35a0a17069c562d221fb996337d251c622d9ba5b30c85223d346ca07c27b90c77039f9dfb62620d036c79a"

RPROVIDES:${PN} += "mmc-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
