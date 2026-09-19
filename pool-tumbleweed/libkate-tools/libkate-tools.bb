SUMMARY = "A karaoke and text codec for embedding in Ogg"
DESCRIPTION = "Kate is a codec for karaoke and text encapsulation for Ogg. Most of the \
time, this would be multiplexed with audio/video to carry subtitles, \
song lyrics (with or without karaoke data), etc, but doesn't have to be. \
A possible use of a lone Kate stream would be an e-book. Moreover, the \
motion feature gives Kate a powerful means to describe arbitrary curves, \
so hand drawing of shapes can be achieved. \
 \
This was originally meant for karaoke use, but can be used for any \
purpose. Motions can be attached to various semantics, like position, \
color, etc, so scrolling or fading text can be defined."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "libkate-tools-0.4.3-1.7.aarch64.rpm"
RPM_HASH = "b57de964b112807c0c2798ce8762546339ab16e0b564b81e243881321cf2ce513e18a5e064b8ddc37b7bee3ae9a9702f874986a231d0eab0762259f720cd714a"

RPROVIDES:${PN} += "libkate-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkate.so.1 \
libogg.so.0 \
liboggkate.so.1 \
libpng16.so.16"

inherit rpm
