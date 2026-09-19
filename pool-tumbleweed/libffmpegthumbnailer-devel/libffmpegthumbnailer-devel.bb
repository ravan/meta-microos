SUMMARY = "Development files for ffmpegthumbnailer"
DESCRIPTION = "Video thumbnailer that can be used by file managers. \
 \
This video thumbnailer can be used to create thumbnails for video \
files. The thumbnailer uses ffmpeg to decode frames from files."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.3"

RPM_NAME = "libffmpegthumbnailer-devel-2.2.3-1.8.aarch64.rpm"
RPM_HASH = "5f92d741231ac8681a69d7ddf1a6929cb8c7bfe83106ecf81a67780551d9f360bf840c1c068536848c36524adb05a9dbea4edfb2743178703a22839753a5c17b"

RPROVIDES:${PN} += "libffmpegthumbnailer-devel \
pkgconfig-libffmpegthumbnailer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libffmpegthumbnailer4"

inherit rpm
