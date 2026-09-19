SUMMARY = "Video thumbnailer that can be used by file managers"
DESCRIPTION = "This video thumbnailer can be used to create thumbnails for \
video files. The thumbnailer uses ffmpeg to decode frames from the \
video files, so supported video formats depend on the configuration \
flags of ffmpeg. \
 \
The project also includes a C/C++ library that can be used by \
developers to generate thumbnails in their projects."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.3"

RPM_NAME = "ffmpegthumbnailer-2.2.3-1.8.aarch64.rpm"
RPM_HASH = "065e3a98fbb73125ae1b4b23c03b98fc24c834b4670e569bd97f7acb848a2326ee1d4f02ea698c67e22608339298963cb897c34d29edd96bed5bbc415e396a4d"

RPROVIDES:${PN} += "ffmpegthumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffmpegthumbnailer.so.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
