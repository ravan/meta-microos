SUMMARY = "Console audio player"
DESCRIPTION = "MOC (music on console) is a console audio player for LINUX/UNIX designed to be \
powerful and easy to use. \
You just need to select a file from some directory using the menu similar to \
Midnight Commander, and MOC will start playing all files in this directory \
beginning from the chosen file. There is no need to create play lists like in \
other players. \
If you want to combine some files from one or few directories on one play list, \
you can do this. The play list will be remembered between runs or you can save \
it as an m3u file to load it whenever you want. \
Need the console where MOC is running for more important things? Need to close \
the X terminal emulator? You don't have to stop playing - just press q and the \
interface will be detached leaving the server running. You can attach it later, \
or you can attach one interface in the console, and another in the X terminal \
emulator, no need to switch just to play another file. \
MOC plays smoothly, regardless of system or I/O load because it uses the output \
buffer in a separate thread. It doesn't cause gaps between files, because the \
next file to be played is precached while playing the current file. \
 \
Internet stream (Icecast, Shoutcast) are supported. \
Key mapping can be fully customized. \
Supported file formats are: mp3, Ogg Vorbis, FLAC, Musepack, Speex, WAVE, AIFF, \
AU (and other less popular formats supported by libsndfile. New formats support \
is under development. \
 \
Other features: \
  * Simple mixer. \
  * Color themes. \
  * Searching the menu (the play list or a directory) like M-s in Midnight Commander. \
  * The way MOC creates titles from tags is configurable. \
  * Optional character set conversion for file tags using iconv(). \
  * OSS, JACK, and ALSA output."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0~svn2994"

RPM_NAME = "moc-2.6.0~svn2994-8.3.aarch64.rpm"
RPM_HASH = "7cbec47fc98635523644d671fce001feb64294039e0aeb7b00f7676926d6a52cf6a9ef3537e0e3069be232914a13d6616ce93d01bc415a6af8aa754358a759b2"

RPROVIDES:${PN} += "libffmpeg-decoder.so \
libflac-decoder.so \
libmodplug-decoder.so \
libmusepack-decoder.so \
libsndfile-decoder.so \
libspeex-decoder.so \
libtimidity-decoder.so \
libvorbis-decoder.so \
libwavpack-decoder.so \
moc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libasound.so.2 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libcurl.so.4 \
libdb-4.8.so \
libjack.so.0 \
libltdl.so.7 \
libm.so.6 \
libmagic.so.1 \
libmodplug.so.1 \
libmpcdec.so.5 \
libncursesw.so.6 \
libogg.so.0 \
libpopt.so.0 \
librcc.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libspeex.so.1 \
libtag-c.so.2 \
libtimidity.so.2 \
libtinfo.so.6 \
libvorbisfile.so.3 \
libwavpack.so.1"

inherit rpm
