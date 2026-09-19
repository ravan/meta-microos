SUMMARY = "Subtitle editor"
DESCRIPTION = "Aegisub is a subtitle editor. It works with the Advanced SubStation \
Alpha format (aptly abbreviated ASS) which allows for many advanced \
effects in the subtitles, apart from just basic timed text."
LICENSE = "BSD-3-Clause"

PV = "3.4.2"

RPM_NAME = "aegisub-3.4.2-4.6.aarch64.rpm"
RPM_HASH = "9f725128bf366dc5237df5108c4846a79eda76dee7d84045a7a6365ed14ddb6e967cd3efb21e53e08b4862cfda739a420e400849b37b2d8cda073b50380fdf26"

RPROVIDES:${PN} += "aegisub"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libasound.so.2 \
libass.so.9 \
libboost-locale.so.1.91.0 \
libc.so.6 \
libffms2.so.5 \
libfftw3.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libopenal.so.1 \
libportaudio.so.2 \
libpulse.so.0 \
libstdc++.so.6 \
libuchardet.so.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-gl-suse.so.16.0.0 \
libwx-gtk3u-stc-suse.so.16.0.0 \
libz.so.1"

inherit rpm
