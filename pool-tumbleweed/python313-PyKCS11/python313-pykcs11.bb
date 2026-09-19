SUMMARY = "A Full PKCS#11 wrapper for Python"
DESCRIPTION = "A Full PKCS#11 wrapper for Python"
LICENSE = "GPL-2.0-or-later"

PV = "1.5.19"

RPM_NAME = "python313-PyKCS11-1.5.19-1.1.aarch64.rpm"
RPM_HASH = "ae5b37bba51cac4a9fb7069e6455d402e85f817ba19521b74cfc53c352cbc1abb7b68b5e7df313c52b203c3ef30b4fa59919445e02efc45a4f67c992c387cb27"

RPROVIDES:${PN} += "python3-PyKCS11 \
python3.13dist-pykcs11 \
python313-PyKCS11 \
python3dist-pykcs11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
