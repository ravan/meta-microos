SUMMARY = "The 'Logo' of Linux 2.0"
DESCRIPTION = "Based on xteddy -- really cute ;-)"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "xpinguin-1.0.2-1237.10.aarch64.rpm"
RPM_HASH = "2b193a09f87c69921ea06cf5543ee67f5c8806547d6eea9fb799fb43d126fee69c18d77a9d527ba987195eb6715c8de292d078f4a9fbabb6ca63a8eb57c4c1ee"

RPROVIDES:${PN} += "xpinguin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6"

inherit rpm
