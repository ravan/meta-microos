SUMMARY = "Class and tools for handling of IPv4 and IPv6 addresses and networks"
DESCRIPTION = "The IP class allows a comfortable parsing and handling for most \
notations in use for IPv4 and IPv6 addresses and networks. It was \
greatly inspired by RIPE's Perl module NET::IP's interface but \
doesn't share the implementation. It doesn't share non-CIDR netmasks, \
so funky stuff like a netmask of 0xffffff0f can't be done here."
LICENSE = "BSD-3-Clause"

PV = "1.01"

RPM_NAME = "python314-ipy-1.01-2.5.noarch.rpm"
RPM_HASH = "76830d1d27183cbb6734fdd821c4d4f194d3a3a95992608599dff3bf1c14c1ec89978a36c5ef37e9aa9290bfacfb99fd86ab0b5fad10037ffbea9c8205372b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipy \
python314-ipy \
python3dist-ipy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
