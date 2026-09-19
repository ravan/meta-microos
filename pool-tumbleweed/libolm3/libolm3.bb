SUMMARY = "Double Ratchet cryptographic library as a C API"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Double Ratchet cryptographic library as a C API"
LICENSE = "Apache-2.0"

PV = "3.2.16"

RPM_NAME = "libolm3-3.2.16-2.4.aarch64.rpm"
RPM_HASH = "8437b7dd1db5d2e33377587e29520665e31936bf7b18eb339a8cbca5686f33274bac50eb4c6779244ec2c21616ed5142f1bac02777bd5dce29ef7584324ba60e"

RPROVIDES:${PN} += "libolm.so.3 \
libolm3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
