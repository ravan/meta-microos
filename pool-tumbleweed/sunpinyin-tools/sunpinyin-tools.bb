SUMMARY = "Dictionary tools for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides dictionary tools needed by it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-tools-2.0.99.2-3.6.aarch64.rpm"
RPM_HASH = "dc0b4072154935bd328fb7dfb18b0b0c1cb84e4c1f473cf4f08ad3c2fa16ca170b43a59fa412514b975dbdfcc0161c56534d1720c281f6cbf50074bfe9736c41"

RPROVIDES:${PN} += "sunpinyin-tools"

RDEPENDS:${PN} += "/usr/bin/make \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
