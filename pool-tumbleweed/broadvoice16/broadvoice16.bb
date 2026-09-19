SUMMARY = "BroadVoice 16 Speech Codec"
DESCRIPTION = "BroadVoice is a family of speech coding algorithms created by \
Broadcom and standardized by CableLabs, SCTE, and ANSI for Voice over \
IP applications in cable telephony. BroadVoice is also part of the \
ITU-T Recommendations J.161 and J.361."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice16-1.2-4.9.aarch64.rpm"
RPM_HASH = "9fba95ad0b66749926b9dddc1e9d79dc4bc832544ff3155d42e1da6a5a5a6c7c02a49280c197de57c96250e4bbaf0406640f562e8bb8729f9163a917abbf2445"

RPROVIDES:${PN} += "broadvoice16 \
libbv16.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
