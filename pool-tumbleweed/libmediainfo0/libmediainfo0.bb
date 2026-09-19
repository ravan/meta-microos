SUMMARY = "Library for supplying technical and tag information about a video or audio file"
DESCRIPTION = "MediaInfo supplies technical and tag information about a video or \
audio file. \
 \
Information that can be retrieved: \
* General: title, author, director, album, track number, date, duration... \
* Video: codec, aspect, fps, bitrate... \
* Audio: codec, sample rate, channels, language, bitrate... \
* Text: language of subtitle \
* Chapters: number of chapters, list of chapters \
 \
DivX, XviD, H263, H.263, H264, x264, ASP, AVC, iTunes, MPEG-1, \
MPEG1, MPEG-2, MPEG2, MPEG-4, MPEG4, MP4, M4A, M4V, QuickTime, \
RealVideo, RealAudio, RA, RM, MSMPEG4v1, MSMPEG4v2, MSMPEG4v3, \
VOB, DVD, WMA, VMW, ASF, 3GP, 3GPP, 3GP2 \
 \
Container formats that are supported: \
* Video: MKV, OGM, AVI, DivX, WMV, QuickTime, Real, MPEG-1, \
  MPEG-2, MPEG-4, DVD (VOB) (Codecs: DivX, XviD, MSMPEG4, ASP, \
  H.264, AVC...) \
* Audio: OGG, MP3, WAV, RA, AC3, DTS, AAC, M4A, AU, AIFF \
* Subtitles: SRT, SSA, ASS, SAMI \
 \
This package contains the shared library for MediaInfo(-gui)."
LICENSE = "BSD-2-Clause"

PV = "26.05"

RPM_NAME = "libmediainfo0-26.05-1.3.aarch64.rpm"
RPM_HASH = "095a241b135d152d06437669336a3f8805e5fcc0e2698f839f4d76c7c0d60fdb85acc39a58b44cea5aefa0eddf84f133dd942c85f875f760b0b58035cb6089d6"

RPROVIDES:${PN} += "libmediainfo.so.0 \
libmediainfo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libmms.so.0 \
libstdc++.so.6 \
libz.so.1 \
libzen.so.0"

inherit rpm
