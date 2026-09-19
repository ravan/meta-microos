SUMMARY = "Library for extracting Metadata"
DESCRIPTION = "KFileMetaData provides plugins for extracting file metadata."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-kfilemetadata-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7f25b7efb4880d50c257588ee618278d33872f806af79f93c79cbae16301fb6e75ebb8ba8239767fb6d3e74b73929bb46e6adb6c1adb0568c8e7a6ebc12202e2"

RPROVIDES:${PN} += "kf6-kfilemetadata"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6FileMetaData.so.3 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Xml.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libepub.so.0 \
libexiv2.so.28 \
libgcc-s.so.1 \
libpoppler-qt6.so.3 \
libstdc++.so.6 \
libtag.so.2"

inherit rpm
