SUMMARY = "Smart Card Utilities"
DESCRIPTION = "OpenSC provides a set of utilities to access smart cards. It mainly \
focuses on cards that support cryptographic operations. It facilitates \
their use in security applications such as mail encryption, \
authentication, and digital signature. OpenSC implements the PKCS#11 \
API. Applications supporting this API, such as Mozilla Firefox and \
Thunderbird, can use it. OpenSC implements the PKCS#15 standard and aims \
to be compatible with every software that does so, too. \
 \
Before purchasing any cards, please read carefully documentation on the \
web pageonly some cards are supported. Not only card type matters, but \
also card version, card OS version and preloaded applet. Only subset of \
possible operations may be supported for your card. Card initialization \
may require third party proprietary software."
LICENSE = "LGPL-2.1-or-later"

PV = "0.27.1"

RPM_NAME = "opensc-0.27.1-2.3.aarch64.rpm"
RPM_HASH = "d39ccebbdee22690fe03a7d664e351ddcf94bcfeb0b92b7eb66bba1c846f0d74320f0796c575d0812c8ebabc12363c1556862106ba2da1df7e07e824b9397ba5"

RPROVIDES:${PN} += "config-opensc \
libopensc.so.13 \
libsmm-local.so.13 \
opensc \
pkgconfig-opensc-pkcs11"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libeac.so.3 \
libreadline.so.8 \
libz.so.1 \
pcsc-lite"

inherit rpm
