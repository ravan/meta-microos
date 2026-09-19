SUMMARY = "Python module to interface with iwlib"
DESCRIPTION = "Python-iwlib is a package for interfacing with iwlib, providing an implementation to \
the wireless tools in Linux. \
 \
It provides scanning, setting the ESSID of a device, and getting the current \
configuration back from a device."
LICENSE = "GPL-2.0-only"

PV = "1.7.0"

RPM_NAME = "python313-iwlib-1.7.0-1.4.aarch64.rpm"
RPM_HASH = "19d294857a0bee9079758d75ecd506ae4c89aceff1ba9b32d93bbbe9b435bb7c54c4c3ec405166d03bd1b14c2b5134c0896ab20ab4da0bceed3a6c0f0b58e763"

RPROVIDES:${PN} += "python3-iwlib \
python3.13dist-iwlib \
python313-iwlib \
python3dist-iwlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiw.so.30 \
python-abi \
python313-cffi"

inherit rpm
