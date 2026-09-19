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

RPM_NAME = "libkate1-0.4.3-1.7.aarch64.rpm"
RPM_HASH = "d491a55d2052f3e65da1a46318b939321141d5724e9988d9d0ad1f89eeed7cbdac2f34faed3b1cd7234df5022337d32d9e026ff3a2f687b4d03881aef6c41335"

RPROVIDES:${PN} += "libkate.so.1 \
libkate1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
