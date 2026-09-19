SUMMARY = "Python interface to the sendmail milter API"
DESCRIPTION = "This is a Python extension module to enable python scripts to attach to \
sendmail's libmilter functionality. Additional Python modules provide for \
navigation and modification of MIME parts, sending DSNs, and doing CBV."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.6"

RPM_NAME = "python313-pymilter-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "7459f86287dea9dc120d76be8d2dd2cf44c24f3d5a502d21c95701dc93dc0fe34108df3728f81505a95389d66b5e0803565e0b1a32d5da7a53868c0fe6c3e082"

RPROVIDES:${PN} += "python3-pymilter \
python3.13dist-pymilter \
python313-pymilter \
python3dist-pymilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmilter.so.1.0 \
pymilter-common \
python-abi \
python313 \
python313-bsddb3 \
python313-py3dns"

inherit rpm
