SUMMARY = "Emu10k1 patch loader library"
DESCRIPTION = "This package contains the patch loader program for Emu10k1 and Emu10k1 on ALSA."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.8p1"

RPM_NAME = "liblo10k1-0-0.1.8p1-29.4.aarch64.rpm"
RPM_HASH = "a50f9b0ca1d40ef2e81a085a0ffd424246b3af176a4ab1da9431003269888d66086ee8ca33a8a18810d922985aea354fb02badbdfd9d794fe53abf85b889bcca"

RPROVIDES:${PN} += "liblo10k1-0 \
liblo10k1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
