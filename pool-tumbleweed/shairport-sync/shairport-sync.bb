SUMMARY = "An AirPlay audio player"
DESCRIPTION = "Shairport Sync is an AirPlay audio player – it plays audio streamed from iTunes, \
iOS, Apple TV and macOS devices and AirPlay sources such as Quicktime Player and \
ForkedDaapd, among others. \
 \
Audio played by a Shairport Sync-powered device stays synchronised with the \
source and hence with similar devices playing the same source. In this way, \
synchronised multi-room audio is possible for players that support it, such as \
iTunes. \
 \
Shairport Sync runs on Linux, FreeBSD and OpenBSD. It does not support AirPlay \
video or photo streaming."
LICENSE = "GPL-3.0-only"

PV = "4.3.7"

RPM_NAME = "shairport-sync-4.3.7-2.8.aarch64.rpm"
RPM_HASH = "72b867609a56162e869186ea0274ae025bd427022c2f1c84999970d118d7ea2e868311ee55bde167d835427045d28308bc2ba6a9ea5648407bb2b22510ab0d6d"

RPROVIDES:${PN} += "config-shairport-sync \
shairport-sync"

RDEPENDS:${PN} += "/usr/bin/sh \
avahi \
firewalld \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavcodec.so.62 \
libavutil.so.60 \
libc.so.6 \
libconfig.so.15 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libm.so.6 \
libpipewire-0.3.so.0 \
libplist-2.0.so.4 \
libpopt.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libsodium.so.26 \
libsoxr.so.0 \
libstdc++.so.6 \
libswresample.so.6 \
libuuid.so.1 \
nqptp \
shadow"

inherit rpm
