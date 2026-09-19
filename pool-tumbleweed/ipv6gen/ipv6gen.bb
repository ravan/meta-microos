SUMMARY = "IPv6 prefix generator"
DESCRIPTION = "ipv6gen features: \
generates prefix list of certain length from given prefix \
via one of the 3 methods described in RFC 3531"
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "ipv6gen-1.0-1.18.noarch.rpm"
RPM_HASH = "b1b416e278d78abb1a66cebbab6dfa5ba431415524f001c4a5146c88a4b1fe1ab5af4a430cc497e17e684c60097a04ab590e21fe848f8da122d2c5d8da0576e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ipv6gen"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
