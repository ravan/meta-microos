SUMMARY = "Secure Erasure of Data"
DESCRIPTION = "Wipe is a tool that attempts to effectively degauses the surface of \
a hard disk, making it virtually impossible to retrieve the data \
that was stored on it. This tool is designed to make sure secure \
data that is erased from a hard drive is unrecoverable."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.1"

RPM_NAME = "wipe-2.3.1-19.9.aarch64.rpm"
RPM_HASH = "cca258e5df28443aa1bbd74cf9ee0228e0573277bf4ac3bd020bb96dc2cbbbbfbca1ab54a9e6356f03e77fbbfad2da288c76f9ef0a6d0991c96f84b38711f762"

RPROVIDES:${PN} += "wipe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
