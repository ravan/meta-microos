SUMMARY = "A Simple Password Strength Checking Library"
DESCRIPTION = "libpasswdqc is a simple password strength checking library. \
In addition to checking regular passwords, it offers support for passphrases \
and can provide randomly generated ones."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libpasswdqc0-1.4.0-2.18.aarch64.rpm"
RPM_HASH = "f18b199dea6acd6862a790b3c6056bd53dc700a5ee3b2b37d6830c1805e7dab9f4eddab5b6412fcc38e636546f86a040edf3e304be723e7035e3f933f8d618d4"

RPROVIDES:${PN} += "libpasswdqc.so.0 \
libpasswdqc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
