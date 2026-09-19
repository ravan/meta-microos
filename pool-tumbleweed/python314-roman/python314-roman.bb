SUMMARY = "Integer to Roman numerals converter"
DESCRIPTION = "This module converts from and to Roman numerals. It can convert numbers from \
1 to 4999 and understands the common shortcuts (IX == 9), but not illegal ones (MIM == 1999)."
LICENSE = "ZPL-2.1"

PV = "5.2"

RPM_NAME = "python314-roman-5.2-1.2.noarch.rpm"
RPM_HASH = "68ab00a2f2c7816a3a74604228d66f657fe72b1b1ea995c5fbae08bcf646f35002a8ff9f84157a918f58f33ce31210033fb0f3fab7e285c3dfab35b3c7f40692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-roman \
python314-roman \
python3dist-roman"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
