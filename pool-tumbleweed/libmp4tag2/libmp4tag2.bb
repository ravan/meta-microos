SUMMARY = "MP4 tagging library"
DESCRIPTION = "An MP4 tagging library where all tags can be accessed and modified. Any tags, \
unknown tags or custom tags are never lost when the audio file is updated. A \
list of known tags is only used when new tags are added. \
 \
This package contains the shared library."
LICENSE = "Zlib"

PV = "2.0.4"

RPM_NAME = "libmp4tag2-2.0.4-1.3.aarch64.rpm"
RPM_HASH = "64d837243434dda725eb6e807eb9fad9c874b83a6a681e93e342b4527935ee12c10af4ff57f952c78c1839ef1d379088a15698483621e6e224627d4b8f17a1fc"

RPROVIDES:${PN} += "libmp4tag.so.2 \
libmp4tag2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
