SUMMARY = "Library implementing the Secure Element control"
DESCRIPTION = "When a Secure Element -supported by OP-TEE- enables SCP03, the \
encryption keys could have been derived from the HUK and therefore not \
known to the normal world. \
 \
In such circumstances, APDU frames will need to be routed to the \
secure world for encryption before sending them to the SE and then \
decrypted when processing the response. \
 \
Secure Elements supporting SCP03 are shipped with predefined keys \
stored in persistent memory and documented in their data sheets. \
 \
This library provides an interface to enable SCP03 using those \
non-secure keys. It also provides an interface to rotate these default \
keys and derive board unique new ones before enabling the SCP03 \
session."
LICENSE = "BSD-2-Clause"

PV = "4.6.0"

RPM_NAME = "libseteec0-4.6.0-1.6.aarch64.rpm"
RPM_HASH = "6a91c6ef58d38570e58cc4dec7197898332211c3acbeedebd86559b7caca38029668ff70f6f91b20f7e368b4f5c82e48dd73b7ced0901f46f47eed953cdc8207"

RPROVIDES:${PN} += "libseteec.so.0 \
libseteec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libteec.so.2"

inherit rpm
