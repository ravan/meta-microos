SUMMARY = "Uncompress MS-TNEF Archives"
DESCRIPTION = "This tool uncompresses MS-TNEF archives as used by some mailers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.18"

RPM_NAME = "tnef-1.4.18-4.5.aarch64.rpm"
RPM_HASH = "1c83b9bc7cc8dcdf956dd1da3ac93ae68c5fc70feb45ade82df68f3ac8c7813449e9fb496968b6dab9fd6580bba95a99e7400d200778f65e39db2e24aa2b4f32"

RPROVIDES:${PN} += "tnef"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
