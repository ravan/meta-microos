SUMMARY = "GNU dbm key/data database compat wrapper"
DESCRIPTION = "GNU dbm is a library of database functions that use extensible \
hashing and work similar to the standard UNIX dbm. These routines are \
provided to a programmer needing to create and manipulate a hashed \
database. \
 \
This library is providing compatibility wrappers."
LICENSE = "GPL-3.0-or-later"

PV = "1.26"

RPM_NAME = "libgdbm_compat4-1.26-1.6.aarch64.rpm"
RPM_HASH = "a513b8d4b8a3b46cc104512539ce876105048d935760adc601da73ac4727f7c819491df002903aae76a0bea8b8f51bdbb1e4432c9673e9a5478ca3dd089925f3"

RPROVIDES:${PN} += "libgdbm-compat.so.4 \
libgdbm-compat4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm.so.6"

inherit rpm
