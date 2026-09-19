SUMMARY = "Python 3 bindings for libpwquality"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks. \
 \
This package provides Python 3 bindings for the libpwquality library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "python3-pwquality-1.4.5-5.9.aarch64.rpm"
RPM_HASH = "a3dc0c1645e363c7da0f1771987dc4247dcd1d11c050c27879388b33ace6dba510fe1b38a6968dade031f047d14121c84a6e838e029c591ace0847b6306391fd"

RPROVIDES:${PN} += "python-pwquality \
python3-pwquality \
python3.13dist-pwquality \
python3dist-pwquality"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpwquality.so.1 \
python-abi"

inherit rpm
