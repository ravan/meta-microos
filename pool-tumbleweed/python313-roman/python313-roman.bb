SUMMARY = "Integer to Roman numerals converter"
DESCRIPTION = "This module converts from and to Roman numerals. It can convert numbers from \
1 to 4999 and understands the common shortcuts (IX == 9), but not illegal ones (MIM == 1999)."
LICENSE = "ZPL-2.1"

PV = "5.2"

RPM_NAME = "python313-roman-5.2-1.2.noarch.rpm"
RPM_HASH = "8a027ff1b095abfa27a6802e7d79b41c8d9b2df1d43cb641cd59a1245addc9b6b031c0d42b0fa91ac88cbf797630b4af4bc7c8536d9da5128ca2983ad26fffce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-roman \
python3.13dist-roman \
python313-roman \
python3dist-roman"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
