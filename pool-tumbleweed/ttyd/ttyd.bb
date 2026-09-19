SUMMARY = "Share your terminal over the web"
DESCRIPTION = "Ttyd is a simple command-line tool for sharing terminal over the web, inspired \
by GoTTY. \
 \
Features include: \
 * Built on top of Libwebsockets with C for speed \
 * Fully-featured terminal based on Xterm.js with CJK and IME support \
 * SSL support based on OpenSSL \
 * Run any custom command with options \
 * Basic authentication support and many other custom options \
 * Cross platform: macOS, Linux, FreeBSD, OpenWrt/LEDE, Windows"
LICENSE = "MIT"

PV = "1.7.7"

RPM_NAME = "ttyd-1.7.7-1.6.aarch64.rpm"
RPM_HASH = "c24ed6d76be2a461d108f76506dca04ae588a55010861edd47b3794d819a396cba8a1d977a978e7dca80b23cdab247526bc6040a4d72eefb91e56e0a9f9964ee"

RPROVIDES:${PN} += "ttyd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjson-c.so.5 \
libssl.so.3 \
libuv.so.1 \
libwebsockets.so.21 \
libz.so.1"

inherit rpm
