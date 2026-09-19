SUMMARY = "A Fortran-77 to C Translator"
DESCRIPTION = "This package uses an 'f77' script that hides the C translation process from the user."
LICENSE = "MIT"

PV = "20240504"

RPM_NAME = "libf2c0-20240504-1.3.aarch64.rpm"
RPM_HASH = "d64bd81f84a9b13392b3a4be50de165bbd46fea7781b108abc0ca05cc74d61c50013875c40b375bd6eb7464301fe64c9839f4c397502a5dfbc8b95660a86c3e5"

RPROVIDES:${PN} += "libf2c.so.0.23 \
libf2c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
