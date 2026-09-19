SUMMARY = "Development files for argon2"
DESCRIPTION = "Headers for argon2, the reference C implementation of Argon2, the \
password hashing function that won the Password Hashing Competition \
(PHC) in 2015."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "argon2-devel-20190702-4.9.aarch64.rpm"
RPM_HASH = "57ed8cee38025796cb6917a297bfb50e9103a711e588e972f5f761b513a2889590ef0d4eed1bd973a9f3618eaf94a5446cee1fe70aba2876b0c3eda7814ac7b7"

RPROVIDES:${PN} += "argon2-devel \
pkgconfig-libargon2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libargon2-1"

inherit rpm
