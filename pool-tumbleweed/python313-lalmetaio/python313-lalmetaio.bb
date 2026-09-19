SUMMARY = "LSC Algorithm MetaIO Library"
DESCRIPTION = "The LSC Algorithm MetaIO Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.6"

RPM_NAME = "python313-lalmetaio-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "48c79cf89729677ddcd324ff24304e837d3f79cf6c6468c665a168847f113523b8716f94e5c1b9732930ac2a09773bb0868f9c6d1debe16d24e0b87dff38f017"

RPROVIDES:${PN} += "python3-lalmetaio \
python313-lalmetaio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalmetaio.so.11 \
liblalsupport.so.14 \
python-abi \
python313-lal \
python313-numpy"

inherit rpm
