SUMMARY = "A karaoke and text codec for embedding in Ogg - Development Files"
DESCRIPTION = "Kate is a codec for karaoke and text encapsulation for Ogg. Most of the \
time, this would be multiplexed with audio/video to carry subtitles, \
song lyrics (with or without karaoke data), etc, but doesn't have to be. \
A possible use of a lone Kate stream would be an e-book. Moreover, the \
motion feature gives Kate a powerful means to describe arbitrary curves, \
so hand drawing of shapes can be achieved. \
 \
This was originally meant for karaoke use, but can be used for any \
purpose. Motions can be attached to various semantics, like position, \
color, etc, so scrolling or fading text can be defined. \
 \
This package contains files for developers."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "libkate-devel-0.4.3-1.7.aarch64.rpm"
RPM_HASH = "d62992959b729aeccef3a28279411f718b6e31ec93cfd071ae8be95ee4e047ee548e577476664ea1e8d627f2a7d447c7e6f8996a96f76c47799e6449c1b0b284"

RPROVIDES:${PN} += "libkate-devel \
pkgconfig-kate \
pkgconfig-oggkate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkate1 \
liboggkate1 \
pkgconfig-kate \
pkgconfig-ogg"

inherit rpm
