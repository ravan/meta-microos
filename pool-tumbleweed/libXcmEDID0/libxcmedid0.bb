SUMMARY = "EDID Color Management Parsing"
DESCRIPTION = "EDID parser implementing the key/value pairs needed for the ICC meta Tag for Monitor Profiles spec. \
http://www.freedesktop.org/wiki/Specifications/icc_meta_tag_for_monitor_profiles"
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcmEDID0-0.5.4-1.32.aarch64.rpm"
RPM_HASH = "b0abbfd9eac24a6634423383339426ee31f97359fb26dcfb263b7651519a56b44824a637b21cbdecf7b234aedf0c39e7e3887cd308f7777dbdd35583255d7b30"

RPROVIDES:${PN} += "libXcmEDID.so.0 \
libXcmEDID0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
