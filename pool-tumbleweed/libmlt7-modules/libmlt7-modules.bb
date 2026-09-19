SUMMARY = "Modules for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
The functionality of the system is provided via an assortment of \
tools, XML authoring components, and an plug-in based API."
LICENSE = "GPL-3.0-or-later"

PV = "7.40.0"

RPM_NAME = "libmlt7-modules-7.40.0-1.1.aarch64.rpm"
RPM_HASH = "6b0e72633bf431237923b5e351974f370445d859a47f11013b23d7a6102a560ddd398a09817220250d0c09d72d4c3e9f99f8e5622c02b81358bb8d2e41d38c8d"

RPROVIDES:${PN} += "libmlt7-modules \
libmltavformat.so \
libmltcore.so \
libmltdecklink.so \
libmltfrei0r.so \
libmltgdk.so \
libmltjackrack.so \
libmltkdenlive.so \
libmltladspa.so \
libmltmovit.so \
libmltnormalize.so \
libmltoldfilm.so \
libmltopencv.so \
libmltopenfx.so \
libmltplus.so \
libmltplusgpl.so \
libmltresample.so \
libmltrnnoise.so \
libmltrtaudio.so \
libmltrubberband.so \
libmltsdl2.so \
libmltsox.so \
libmltvidstab.so \
libmltvorbis.so \
libmltxine.so \
libmltxml.so \
mlt-7)(avformat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libavcodec.so.62 \
libavdevice.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libebur128.so.1 \
libepoxy.so.0 \
libexif.so.12 \
libfftw3.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libjack.so.0 \
liblilv-0.so.0 \
libm.so.6 \
libmlt++-7.so.7 \
libmlt-7.so.7 \
libmovit.so.8 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libopencv-tracking.so.413 \
libopencv-video.so.413 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
librnnoise.so.0 \
librtaudio.so.7 \
librubberband.so.3 \
libsamplerate.so.0 \
libsox.so.3 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libvidstab.so.1.2 \
libvorbisfile.so.3 \
libxml2.so.16"

inherit rpm
