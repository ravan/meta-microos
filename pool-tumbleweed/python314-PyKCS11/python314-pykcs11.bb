SUMMARY = "A Full PKCS#11 wrapper for Python"
DESCRIPTION = "A Full PKCS#11 wrapper for Python"
LICENSE = "GPL-2.0-or-later"

PV = "1.5.19"

RPM_NAME = "python314-PyKCS11-1.5.19-1.1.aarch64.rpm"
RPM_HASH = "eab5f85c804dcb8fc66c96527f79ce222375f09cfd587214e3cfb776b996e4a53d359eb2806b8883e4c543d77b754aa3afd9bab3ce745b7bcc5bd13bf25d35df"

RPROVIDES:${PN} += "python3.14dist-pykcs11 \
python314-PyKCS11 \
python3dist-pykcs11"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
