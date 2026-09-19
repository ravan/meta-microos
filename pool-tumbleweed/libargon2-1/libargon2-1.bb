SUMMARY = "The reference C implementation of Argon2"
DESCRIPTION = "Reference C implementation of Argon2, the password-hashing function \
that won the Password Hashing Competition (PHC) in 2015."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "libargon2-1-20190702-4.9.aarch64.rpm"
RPM_HASH = "bdc3969ec51bdbe6cd87108fd348637cf751ab757ead61d33e1cbb1268c40b5b46a0186b5ae44f0c5cd69093d49f804f267fb80dfdeb8b4424cb241c6d72a4d2"

RPROVIDES:${PN} += "libargon2-1 \
libargon2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
