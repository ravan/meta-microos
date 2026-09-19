SUMMARY = "Simple fixed-width integers"
DESCRIPTION = "This module provides fixed-size integer classes which retain their fixed nature across \
arithmetic operations. It is geared towards users who need to emulate machine integers. \
 \
It provides flexible classes for defining integers with a fixed number of bits, as well \
as predefined classes for common machine integer sizes. These classes can be used as \
drop-in replacements for int/long, and can be sliced to extract bitfields. \
 \
Mutable versions of these integers are provided, enabling usages such as emulation \
of machine registers."
LICENSE = "Python-2.0"

PV = "0.2.0"

RPM_NAME = "python314-fixedint-0.2.0-3.10.noarch.rpm"
RPM_HASH = "04a9791fade758b02c175b11006c2a0fca64fb68144cdc20e108c7d665ad47d6e4affad27f5d8b2080b97406dbf6976515824d01d7ff1aae66ca77bb0fe44fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fixedint \
python314-fixedint \
python3dist-fixedint"

RDEPENDS:${PN} += "python-abi"

inherit rpm
