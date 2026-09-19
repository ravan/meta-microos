SUMMARY = "Python Serial Port Extension"
DESCRIPTION = "Python Serial Port Extension for Win32, Linux, BSD, Jython, IronPython"
LICENSE = "Python-2.0"

PV = "3.5"

RPM_NAME = "python313-pyserial-3.5-7.5.noarch.rpm"
RPM_HASH = "79e9eed65d6941d8e8ecde32f1c84c9ee52addd719953f9917fb14deaabf89d7bb6647dbc83a0ed868d53dadad4257cd6bedabe799452ad90527f23e5f9a4dbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyserial \
python3-serial \
python3.13dist-pyserial \
python313-pyserial \
python313-serial \
python3dist-pyserial"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
