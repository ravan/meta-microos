SUMMARY = "Development files for libmp4tag"
DESCRIPTION = "An MP4 tagging library where all tags can be accessed and modified. Any tags, \
unknown tags or custom tags are never lost when the audio file is updated. A \
list of known tags is only used when new tags are added. \
 \
This package contains files requires for development using libmp4tag."
LICENSE = "Zlib"

PV = "2.0.4"

RPM_NAME = "libmp4tag-devel-2.0.4-1.3.aarch64.rpm"
RPM_HASH = "82deb2d0308483463c3051f83875569645449fd94bac20f8eddc5f048ac24314f2e362ae09d99c330ed273bc50b9a4135f4ad5f4e77425f6594ac3376eabdfb5"

RPROVIDES:${PN} += "libmp4tag-devel \
pkgconfig-libmp4tag"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmp4tag2"

inherit rpm
