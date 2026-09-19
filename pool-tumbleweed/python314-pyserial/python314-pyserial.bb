SUMMARY = "Python Serial Port Extension"
DESCRIPTION = "Python Serial Port Extension for Win32, Linux, BSD, Jython, IronPython"
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python314-pyserial-3.5-7.5.noarch.rpm"
RPM_HASH = "63b86ecb10c1b5ed892d2f1619c4ade90300cded3b377d0e894221fb3bab3b2251950bc8ecf22cda0b2d3a7b12b1b0263375b38f47c23b4b11f432b1b8f96464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyserial \
python314-pyserial \
python314-serial \
python3dist-pyserial"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
