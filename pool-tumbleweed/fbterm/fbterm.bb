SUMMARY = "A fast framebuffer-based terminal emulator"
DESCRIPTION = "FbTerm is a fast terminal emulator for linux with frame buffer device. \
Features include: \
 \
  * mostly as fast as terminal of linux kernel while accelerated scrolling \
    is enabled on framebuffer device \
  * select font with fontconfig and draw text with freetype2, same as \
    Qt/Gtk+ based GUI apps \
  * dynamicly create/destroy up to 10 windows initially running default shell \
  * record scrollback history for every window \
  * auto-detect current locale and convert text encoding, support double \
    width scripts like Chinese, Japanese etc \
  * switch between configurable additional text encodings with hot keys \
    on the fly \
  * copy/past selected text between windows with mouse when gpm server is \
    running \
  * change the orientation of screen display, a.k.a. screen rotation \
  * lightweight input method framework with client-server architecture"
LICENSE = "GPL-2.0-or-later"

PV = "1.8"

RPM_NAME = "fbterm-1.8-2.19.aarch64.rpm"
RPM_HASH = "05fb5f6df54c6c70c6b0fb8e650029a816a749ce32d74b3500b1122021d15e73fb7bc2368d0d14f1e156e762976dd107de8d798a3e6041b6d23e6fa01a0df606"

RPROVIDES:${PN} += "fbterm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libstdc++.so.6"

inherit rpm
