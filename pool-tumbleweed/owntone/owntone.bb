SUMMARY = "DAAP server for iTunes and Chromecast with MPD and RSP support"
DESCRIPTION = "owntone is a DAAP/DACP (iTunes), MPD (Music Player Daemon) \
and RSP (Roku) media server. \
 \
It has support for AirPlay devices/speakers, Apple Remote (and compatibles), \
MPD clients, Chromecast, network streaming, internet radio, Spotify and LastFM. \
 \
It does not support streaming video by AirPlay nor Chromecast. \
 \
DAAP stands for Digital Audio Access Protocol, and is the protocol used \
by iTunes and friends to share/stream media libraries over the network. \
 \
owntone is a complete rewrite of mt-daapd (Firefly Media Server)."
LICENSE = "GPL-2.0-or-later"

PV = "29.0"

RPM_NAME = "owntone-29.0-2.8.aarch64.rpm"
RPM_HASH = "79262b29360a68af618873b1d66c60658870e25e9e8e7be17a16714c8bc76aed3cc5d125acbfefff5b063583040ed10bd5b07bbdabd944b561a3b5d19ce9ffab"

RPROVIDES:${PN} += "config-owntone \
forked-daapd \
group-owntone \
owntone \
user-owntone"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libconfuse.so.2 \
libcurl.so.4 \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libgcrypt.so.20 \
libgnutls.so.30 \
libgpg-error.so.0 \
libjson-c.so.5 \
libm.so.6 \
libmount.so.1 \
libplist-2.0.so.4 \
libprotobuf-c.so.1 \
libpulse.so.0 \
libsodium.so.26 \
libsqlite3.so.0 \
libunistring.so.5 \
libwebsockets.so.22 \
libxml2.so.16 \
libz.so.1 \
logrotate \
pwdutils"

inherit rpm
