SUMMARY = "CoolKey and CAC PKCS #11 PKI Module for Smart Cards"
DESCRIPTION = "Linux Driver support for the CoolKey and CAC products. \
 \
CoolKeys are part of complete PKI solution that provides smart card \
login, single sign-on, secure messaging, and secure email access. In \
the complete solution, users are issued CoolKeys by their employer, \
ISP, bank, or other agency. When the user plugs in the keys for the \
first time, the keys are automatically provisioned with certificates, \
keys, and a PIN unique to that user by the Red Hat Certificate System. \
Once the CoolKey is provisioned, the user can take the key to any \
system and use it to login (authenticate), send and receive signed and \
encrypted email, or participate in secure messaging or IRC \
communication. \
 \
CoolKeys are based on JavaCard 1.2."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "coolkey-devel-1.1.0-154.8.aarch64.rpm"
RPM_HASH = "2c199ed3e72f5faec63ac310bb8e26b23ec47c3d531b542cb6e0661316efba608ce2990b946a55520fffea5f557754465cd8d0411dd7131151c7d5e900dab9ff"

RPROVIDES:${PN} += "coolkey-devel \
pkgconfig-libckyapplet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
coolkey"

inherit rpm
