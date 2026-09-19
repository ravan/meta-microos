SUMMARY = "Yet Another Python Profiler"
DESCRIPTION = "Yet Another Python Profiler"
LICENSE = "MIT"

PV = "1.7.6"

RPM_NAME = "python313-yappi-1.7.6-2.1.aarch64.rpm"
RPM_HASH = "e87200bec2785bbcd42534e0f9ade359b5c81a466ce2f4524d72831a27ef754f9248139462a1b7d8e58ac658564cd1300339a4c353d50c506dfd7975e5380f28"

RPROVIDES:${PN} += "python3-yappi \
python3.13dist-yappi \
python313-yappi \
python3dist-yappi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-setuptools \
update-alternatives"

inherit rpm
