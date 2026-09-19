SUMMARY = "Lightweight Ruby Embedded Environment"
DESCRIPTION = "mruby is the lightweight implementation of the Ruby language complying to (part \
of) the ISO standard."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "libmruby4_0_0-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "a27f2af3bceea1fa66cdf6bbdb83b56ad221bca13099173d795ac1625080798a8de80bd1a3e54dad011eb8365acfb0b1a309584a570f7a214d451819ee075009"

RPROVIDES:${PN} += "libmruby.so.4.0.0 \
libmruby4-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
