SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python314-passlib-1.7.4-9.4.noarch.rpm"
RPM_HASH = "167faad33715090b89b1cd0984481b55fe65ef7e52bfd405b4e0579665d77159ef70e11f33ad1d3e38e5ad8eccbbda9d533145b5dd9e19511f26f5aa3db3a69b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-passlib \
python314-passlib \
python3dist-passlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
