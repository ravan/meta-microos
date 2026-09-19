SUMMARY = "Python implementation of the patiencediff algorithm"
DESCRIPTION = "Python implementation of the patiencediff algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.18"

RPM_NAME = "python314-patiencediff-0.2.18-1.8.aarch64.rpm"
RPM_HASH = "fcf52c0e0578719880ce13271351baf76ba860c704d641e5cd8c8e069aba1534ba5857c03cb8bc408f5e794fb649f6427163efbf38d324c5c620f068e5834eaf"

RPROVIDES:${PN} += "python3.14dist-patiencediff \
python314-patiencediff \
python3dist-patiencediff"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
