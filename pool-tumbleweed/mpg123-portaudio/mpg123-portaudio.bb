SUMMARY = "Portaudio Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for Portaudio output support."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "mpg123-portaudio-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "8cd8204aba7ab34556198a9fbcfc5ffed8656ddda2a8490dda28b55372739e67cbfea8fb9ae2b21743c429d699432f1222a481ade87ef923aedfa9708456bbd7"

RPROVIDES:${PN} += "mpg123-portaudio"

RDEPENDS:${PN} += "libc.so.6 \
libportaudio.so.2"

inherit rpm
