SUMMARY = "A Cat Catches Your Mouse"
DESCRIPTION = "A nice program that changes your cursor into a cat playing with your \
mouse cursor.  The manual page shows more possibilities to change your \
cursor."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.sakura.5"

RPM_NAME = "oneko-1.2.sakura.5-4.5.aarch64.rpm"
RPM_HASH = "8d2ff816a6610c4e9db7a04f736d0187f299bec2acb246e5133962b83e88ced2c27d1dbbeea14d535d8b1691d90c2b325c0ff87a987650186e3811d72a84fba0"

RPROVIDES:${PN} += "oneko"

RDEPENDS:${PN} += "libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
