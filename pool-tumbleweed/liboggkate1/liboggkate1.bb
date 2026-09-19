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

RPM_NAME = "liboggkate1-0.4.3-1.7.aarch64.rpm"
RPM_HASH = "87bdc8c386b9e666bb5a3ede08c9b596aa6d064b7b08752f5623e58eb8e98bdfda1f51f3bc1d32f4ba54c99da99ba7cd7f88f786117c749618846ed3a003e6c7"

RPROVIDES:${PN} += "liboggkate.so.1 \
liboggkate1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkate.so.1"

inherit rpm
