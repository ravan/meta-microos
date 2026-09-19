SUMMARY = "Efficient ID3 Tag Editor"
DESCRIPTION = "With Kid3 you can: \
  - Edit ID3v1.1 tags \
  - Edit all ID3v2.3 and ID3v2.4 frames \
  - Convert between ID3v1.1, ID3v2.3 and ID3v2.4 tags \
  - Edit tags in MP3, Ogg/Vorbis, FLAC, MPC, APE, MP4/AAC, MP2, Speex, \
    TrueAudio, WavPack, WMA, WAV, AIFF files and tracker modules (MOD, \
    S3M, IT, XM). \
  - Edit tags of multiple files, e.g. the artist, album, year and genre \
    of all files of an album typically have the same values and can be \
    set together. \
  - Generate tags from filenames \
  - Generate tags from the contents of tag fields \
  - Generate filenames from tags \
  - Generate playlist files \
  - Automatic case conversion and string translation \
  - Import and export album data \
  - Import from gnudb.org, TrackType.org, MusicBrainz, Discogs, Amazon \
 \
This package does not use KDE libraries, if you use KDE you should use kid3. \
For a commandline interface you can use kid3-cli."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.7"

RPM_NAME = "kid3-qt-3.9.7-2.6.aarch64.rpm"
RPM_HASH = "330b772d7c3c235bbcfede7009c3d5cc6ad6d410805386bf47f7c96942174a0d4025497634d6f31aada704baf2c5c208c089421a825cd7e7502237a02a9ea7a3"

RPROVIDES:${PN} += "kid3-qt"

RDEPENDS:${PN} += "kid3-core \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkid3-core.so \
libkid3-gui.so \
libstdc++.so.6 \
xdg-utils"

inherit rpm
