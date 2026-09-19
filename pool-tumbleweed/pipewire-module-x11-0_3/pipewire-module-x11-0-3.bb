SUMMARY = "X11 support For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
The framework is used to build a modular daemon that can be configured to: \
 \
 * Be a low-latency audio server with features like pulseaudio and/or jack; \
 * A video capture server that can manage hardware video capture devices \
   and provide access to them; \
 * A central hub where video can be made available for other applications \
   such as the gnome-shell screencast API. \
 \
This package contains X11 bell support for PipeWire."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-module-x11-0_3-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "12ad746b825f7b1e95d1caf6bb9e18a84bd65459c373cb75f518801b3e6bf9f52506e32072f052d2534733e0f52bfec9a8a4301da7e3020b0cc517685a1ef355"

RPROVIDES:${PN} += "libpipewire-module-x11-bell.so \
pipewire-module-x11-0-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libc.so.6 \
libcanberra.so.0 \
libpipewire-0-3-0 \
libpipewire-0.3.so.0 \
pipewire"

inherit rpm
