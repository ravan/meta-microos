SUMMARY = "Class and tools for handling of IPv4 and IPv6 addresses and networks"
DESCRIPTION = "The IP class allows a comfortable parsing and handling for most \
notations in use for IPv4 and IPv6 addresses and networks. It was \
greatly inspired by RIPE's Perl module NET::IP's interface but \
doesn't share the implementation. It doesn't share non-CIDR netmasks, \
so funky stuff like a netmask of 0xffffff0f can't be done here."
LICENSE = "BSD-3-Clause"

PV = "1.01"

RPM_NAME = "python313-ipy-1.01-2.5.noarch.rpm"
RPM_HASH = "5f33d40b5790f2894d923d68d9416df5523d0243426619815d214a8407f98319b2c9286e0bb85595acd99c030dad3d56ff3598350bb4669588a837c7767725b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipy \
python3.13dist-ipy \
python313-ipy \
python3dist-ipy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
