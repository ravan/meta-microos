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

RPM_NAME = "python313-netaddr-1.3.0-3.5.noarch.rpm"
RPM_HASH = "64fc43522100c206f0905ce36b5206c4622249f598a2657adbe4200660a68ab0b525b4bf22323a730aff22c7107b332d4160c5faeb5ade4574b47bb2ea71a56e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netaddr \
python3.13dist-netaddr \
python313-netaddr \
python3dist-netaddr"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
