SUMMARY = "Efficient ID3 Tag Editor"
DESCRIPTION = "f you want to easily tag multiple MP3, Ogg/Vorbis, Opus, DSF, FLAC, \
MPC, MP4/AAC, MP2, Opus, Speex, TrueAudio, WavPack and WMA files \
(e.g. full albums) without typing the same information again and \
again and have control over both ID3v1 and ID3v2 tags, \
then Kid3 is the program you are looking for. \
 \
With Kid3 you can: \
- Edit ID3v1.1 tags \
- Edit all ID3v2.3 and ID3v2.4 frames \
- Convert between ID3v1.1, ID3v2.3 and ID3v2.4 tags \
- Edit tags in MP3, Ogg/Vorbis, FLAC, MPC, MP4/AAC, MP2, Speex, \
  TrueAudio, WavPack, WMA, AIFF and WAV files \
- Edit tags of multiple files, e.g. the artist, album, year and \
  genre of all files of an album typically have the same values \
  and can be set together. \
- Generate tags from filenames \
- Generate tags from the contents of tag fields \
- Generate filenames from tags \
- Rename and create directories from tags \
- Generate playlist files \
- Automatically convert upper and lower case and replace strings \
- Import from freedb2.org, MusicBrainz, Discogs, Amazon and other \
  sources of album data \
- Export tags as CSV, HTML, playlists, Kover XML and in other formats \
- Edit synchronized lyrics and event timing codes,import and export LRC files \
 \
This package uses KDE libraries, if you do not use KDE you should use kid3-qt. \
For a commandline interface you can use kid3-cli."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.7"

RPM_NAME = "kid3-3.9.7-2.6.aarch64.rpm"
RPM_HASH = "546fa98a9822b49ce1ce445702156b00a09a93eb23a4b79303165914b7fbd80e9092869dc076e0363b5124085ca6d21043cded3ef38c9f94730d6aeaa4baa0c1"

RPROVIDES:${PN} += "kid3"

RDEPENDS:${PN} += "kid3-core \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkid3-core.so \
libkid3-gui.so \
libstdc++.so.6 \
libxslt-tools \
xdg-utils"

inherit rpm
