SUMMARY = "Lightweight KMS plane library"
DESCRIPTION = "libliftoff offers using KMS planes from userspace. Users create \
'virtual planes' called layers, set KMS properties on them, and \
libliftoff will pick hardware planes for these layers if possible."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "libliftoff0-0.5.0-1.9.aarch64.rpm"
RPM_HASH = "ce0b49d1d1889b7b996c67e67212298a5c67acf9f952e5e0c1bffce0715c94d79b6b3ee961964178d370f748d09bf9b83e60818a4688106614e3fd02862705e4"

RPROVIDES:${PN} += "libliftoff.so.0 \
libliftoff0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
