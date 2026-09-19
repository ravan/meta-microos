SUMMARY = "Development files for libmp4tag"
DESCRIPTION = "An MP4 tagging library where all tags can be accessed and modified. Any tags, \
unknown tags or custom tags are never lost when the audio file is updated. A \
list of known tags is only used when new tags are added. \
 \
This package contains the CLI tools built from libmp4tag."
LICENSE = "Zlib"

PV = "2.0.4"

RPM_NAME = "libmp4tag-tools-2.0.4-1.3.aarch64.rpm"
RPM_HASH = "f2b85b3164c3162eba5d65acd56804a3b708742a6397fd4428dae5eb05913a860f37cb09a855dc98aa7988b465eea8de38496ffd6ba81836bfe484ced7481782"

RPROVIDES:${PN} += "libmp4tag-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmp4tag.so.2"

inherit rpm
