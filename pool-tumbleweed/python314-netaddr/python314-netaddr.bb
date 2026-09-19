SUMMARY = "Pythonic manipulation of IPv4, IPv6, CIDR, EUI and MAC network addresses"
DESCRIPTION = "A pure Python network address representation and manipulation library. \
 \
netaddr provides a Pythonic way of working with: \
    - IPv4 and IPv6 addresses and subnets (including CIDR notation); \
    - MAC (Media Access Control) addresses in multiple formats; \
    - IEEE EUI-64, OUI and IAB identifiers; \
    - a user friendly IP glob-style format. \
 \
Included are routines for: \
    - generating, sorting and summarizing IP addresses; \
    - converting IP addresses and ranges between various different formats; \
    - performing set based operations on groups of IP addresses and subnets; \
    - arbitrary IP address range calculations and conversions; \
    - querying IEEE OUI and IAB organisational information; \
    - querying of IP standards related data from key IANA data sources."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python314-netaddr-1.3.0-3.5.noarch.rpm"
RPM_HASH = "e4fe83379c32fec06c6c8e1e61633022203de63d95faf1ae121ae75470488cfa7ea9e65d3590d2467856faedbb9603112334dcaaa45b8ed3e3a941369437ab32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-netaddr \
python314-netaddr \
python3dist-netaddr"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
