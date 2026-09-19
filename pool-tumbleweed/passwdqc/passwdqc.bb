SUMMARY = "Tools for Password Checking and Generation"
DESCRIPTION = "The pwqcheck program checks passphrase quality using the libpasswdqc library. \
The pwqgen program generates a random passphrase using the libpasswdqc library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "passwdqc-1.4.0-2.18.aarch64.rpm"
RPM_HASH = "02447b490bbdc9c29a5bf693fa1c60a6d1b40dc27514c846c29e6c67b36a0a99f3a0d0641579f13a5385e563679aabc28c7ba222379e5b40dc4351a9866cc19b"

RPROVIDES:${PN} += "config-passwdqc \
passwdqc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpasswdqc.so.0"

inherit rpm
