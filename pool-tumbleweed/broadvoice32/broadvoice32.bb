SUMMARY = "BroadVoice 32 Speech Codec"
DESCRIPTION = "BroadVoice is a family of speech coding algorithms created by \
Broadcom and standardized by CableLabs, SCTE, and ANSI for Voice over \
IP applications in cable telephony. BroadVoice is also part of the \
ITU-T Recommendations J.161 and J.361."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice32-1.2-3.9.aarch64.rpm"
RPM_HASH = "7713da9076ce0b459b0a3db2afc19f534d62258f6c3bdfaa067cd2b349278fe7b94f653c04898b1fb8463943a2e57843ecc5c1a4b5f096556259cd69f86e06f2"

RPROVIDES:${PN} += "broadvoice32 \
libbv32.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
