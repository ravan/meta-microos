SUMMARY = "Neko virtual machine MySQL library"
DESCRIPTION = "MySQL library for the Neko virtual machine."
LICENSE = "GPL-2.0+"

PV = "2.4.1"

RPM_NAME = "neko-mysql-2.4.1-3.3.aarch64.rpm"
RPM_HASH = "921b5181bbbb7a122f80c18b3f5786a7b069591ec9d7407faa54669ea6fdec35a119110c606e9434e758993c62a249f6e35a84fe8c359bd2ab2ab9b36f89d224"

RPROVIDES:${PN} += "neko-mysql \
nekovm-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libneko.so.2 \
neko"

inherit rpm
