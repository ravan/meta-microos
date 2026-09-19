SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python313-passlib-1.7.4-9.4.noarch.rpm"
RPM_HASH = "f415fea6c07856dd4cdc1622b2a9c0546be20c21e32216a5ae51c182e3f6f5a78349072bda8dc4b159e37bab60f9a12384db7b57e12706d610e72d00f1d750ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-passlib \
python3.13dist-passlib \
python313-passlib \
python3dist-passlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
