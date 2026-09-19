SUMMARY = "The reference C implementation of Argon2"
DESCRIPTION = "This is the reference C implementation of Argon2, the password-hashing function \
that won the Password Hashing Competition (PHC) in 2015. \
 \
Argon2 is a password hashing function that is parametrized by a time cost, a \
memory cost and a parallelism degree, used to guard against side-channel \
attacks, attacks where lots of memory is available, or attacks where a lot of \
processing is available."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "argon2-20190702-4.9.aarch64.rpm"
RPM_HASH = "430ac2c7b5c63d741e398d4060e4c6324ededf215d7051d201bf7a4e14f99294b7fb0c1a69746b739ded0de41ed107c498c2fe5e3ca0885f2d2079e4c4d04d1f"

RPROVIDES:${PN} += "argon2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
