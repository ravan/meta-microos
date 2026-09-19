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

RPM_NAME = "python313-fixedint-0.2.0-3.10.noarch.rpm"
RPM_HASH = "8189f5993ce4818a90a186ef43d604f7bafee69650f2526d16271abaff04e220a61cf30bc55d2b8fa7b0fd203470b479a64fff3fbb64e5d9edf0348dc0138b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fixedint \
python3.13dist-fixedint \
python313-fixedint \
python3dist-fixedint"

RDEPENDS:${PN} += "python-abi"

inherit rpm
