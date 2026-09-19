SUMMARY = "Audio/video file technical and tag information utility"
DESCRIPTION = "MediaInfo supplies technical and tag information about a video or \
audio file. \
 \
It reads the following information: \
* General: title, author, director, album, track number, date, duration... \
* Video: codec, aspect, fps, bitrate... \
* Audio: codec, sample rate, channels, language, bitrate... \
* Text: language of subtitle \
* Chapters: number of chapters, list of chapters \
 \
It supports the following containers/codecs: \
* Video: MKV, OGM, AVI, DivX, WMV, QuickTime, Real, MPEG-1, \
  MPEG-2, MPEG-4, DVD (VOB) (Codecs: DivX, XviD, MSMPEG4, ASP, \
  H.264, AVC...) \
* Audio: OGG, MP3, WAV, RA, AC3, DTS, AAC, M4A, AU, AIFF \
* Subtitles: SRT, SSA, ASS, SAMI"
LICENSE = "GPL-2.0-or-later"

PV = "26.05"

RPM_NAME = "mediainfo-26.05-1.2.aarch64.rpm"
RPM_HASH = "903b0c97c112af65799fba57a22e34b67ef1d32f979857fc0d0ab589c124d9f3f7e85b980f491932b0ccf6c6c27b2872c772ab6f53837aa4fa1878566d48cf50"

RPROVIDES:${PN} += "MediaInfo \
mediainfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmediainfo.so.0 \
libstdc++.so.6 \
libzen.so.0"

inherit rpm
