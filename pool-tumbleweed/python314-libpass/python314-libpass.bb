SUMMARY = "Fork of passlib, a comprehensive password hashing framework"
DESCRIPTION = "This is a fork of https://foss.heptapod.net/python-libs/passlib \
 \
Passlib is a password hashing library for Python 3, which provides \
cross-platform implementations of over 30 password hashing algorithms, as well \
as a framework for managing existing password hashes. It's designed to be useful \
for a wide range of tasks, from verifying a hash found in /etc/shadow, to \
providing full-strength password hashing for multi-user application."
LICENSE = "BSD-3-Clause"

PV = "1.9.3"

RPM_NAME = "python314-libpass-1.9.3-1.3.noarch.rpm"
RPM_HASH = "50c5dbf3f1afc067b6c9d916f5f1f6f15423eed66f85c44ae4560617caeb86e880c8c2750aa245a293724723612efe127f07a411134ef4fc6b79a42460f781fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-libpass \
python314-libpass \
python3dist-libpass"

RDEPENDS:${PN} += "python-abi"

inherit rpm
