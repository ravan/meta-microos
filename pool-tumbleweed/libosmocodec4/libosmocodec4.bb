SUMMARY = "GSM 06.10, 06.20, 06.60, 06.90 codec library"
DESCRIPTION = "The libosmocodec library contains an implementation of multiple \
GSM codecs: \
 \
* GSM 06.10 Full Rate (FR) codec \
* GSM 06.20 Half Rate (HR) codec \
* GSM 06.60 Enhanced Full Range (EFR) codec \
* GSM 06.90 Adaptive Multi-Rate (AMR) codec"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmocodec4-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "cec7e05476d0fd106b091081c7f472962186d24abdcad23e0d592628a7daa69a10fe67f700ebfe2ccc8c57f70e6e31eeafbd5203bf15738db822b13665971f28"

RPROVIDES:${PN} += "libosmocodec.so.4 \
libosmocodec4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22"

inherit rpm
