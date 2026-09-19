SUMMARY = "Lightweight Ruby Embedded Environment"
DESCRIPTION = "mruby is the lightweight implementation of the Ruby language complying to (part \
of) the ISO standard."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "libmruby_core4_0_0-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "267d59438b99f647f51d404bddf0ff8f32a974b0ff88f1da7ed36f214cf68c3a7b7623d1ee5a63c5960202aee12a7b4799dee6966c85cbdbd5c9fe172a63778a"

RPROVIDES:${PN} += "libmruby-core.so.4.0.0 \
libmruby-core4-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
