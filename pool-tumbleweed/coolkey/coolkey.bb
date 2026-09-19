SUMMARY = "CoolKey and CAC PKCS #11 PKI Module for Smart Cards"
DESCRIPTION = "Linux Driver support for the CoolKey and CAC products. CoolKeys are \
part of a complete PKI solution that provides smart card login, single \
sign-on, secure messaging, and secure email access. In the complete \
solution, users are issued CoolKeys by their employer, ISP, bank, or \
other parties. When the user plugs the keys in for the first time, the \
keys are automatically provisioned with certificates, keys, and a PIN, \
unique for that user by the Red Hat Certificate System. Once the \
CoolKey is provisioned, the user can take the key to any system and use \
it to login (authenticate), send and receive signed and encrypted \
email, or participate in secure messaging or IRC communication. \
CoolKeys are based on JavaCard 1.2."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "coolkey-1.1.0-154.8.aarch64.rpm"
RPM_HASH = "2f5369ce64731655712583c3dbe1cc44414d954db081c5279e8f0c1a78cef3da171c013c549c30ceebbfc65d1d3a12674d686cc027207b86da4d989175aec427"

RPROVIDES:${PN} += "coolkey \
libckyapplet.so.1 \
libcoolkeypk11.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsoftokn3.so \
libstdc++.so.6 \
libz.so.1 \
pcsc-ccid \
pcsc-lite"

inherit rpm
