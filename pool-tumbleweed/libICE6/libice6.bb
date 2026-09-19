SUMMARY = "X11 Inter-Client Exchange Library"
DESCRIPTION = "The Inter-Client Exchange (ICE) protocol is intended to provide a \
framework for building such protocols, allowing them to make use of \
common negotiation mechanisms and to be multiplexed over a single \
transport connection."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "libICE6-1.1.2-1.7.aarch64.rpm"
RPM_HASH = "458bfb55fa7eb50ca105a848555e12c3af8d54b8a5f6e96657f63850dd314e29e9772701b852e363c6b6b107b091dddb77565b95f23b097f3059cf60b64a9bdd"

RPROVIDES:${PN} += "libICE.so.6 \
libICE6 \
xorg-x11-libICE"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
