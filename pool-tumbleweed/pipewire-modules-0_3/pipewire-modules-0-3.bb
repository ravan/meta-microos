SUMMARY = "Modules For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
The framework is used to build a modular daemon that can be configured to: \
 \
 * Be a low-latency audio server with features like pulseaudio and/or jack; \
 * A video capture server that can manage hardware video capture devices \
   and provide access to them; \
 * A central hub where video can be made available for other applications \
   such as the gnome-shell screencast API."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "pipewire-modules-0_3-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "22273ccde2f7123c66e5526388588782c9e59bbe28ba63bef8fbbe3df5ce40c164c62e4182948d5065f11393ec54c4d0c3234e5d34e361faa87a4e3664f43b10"

RPROVIDES:${PN} += "libpipewire-module-access.so \
libpipewire-module-adapter.so \
libpipewire-module-avb.so \
libpipewire-module-client-device.so \
libpipewire-module-client-node.so \
libpipewire-module-combine-stream.so \
libpipewire-module-echo-cancel.so \
libpipewire-module-fallback-sink.so \
libpipewire-module-ffado-driver.so \
libpipewire-module-filter-chain.so \
libpipewire-module-link-factory.so \
libpipewire-module-loopback.so \
libpipewire-module-metadata.so \
libpipewire-module-netjack2-driver.so \
libpipewire-module-netjack2-manager.so \
libpipewire-module-parametric-equalizer.so \
libpipewire-module-pipe-tunnel.so \
libpipewire-module-portal.so \
libpipewire-module-profiler.so \
libpipewire-module-protocol-native.so \
libpipewire-module-protocol-simple.so \
libpipewire-module-pulse-tunnel.so \
libpipewire-module-raop-discover.so \
libpipewire-module-raop-sink.so \
libpipewire-module-rt.so \
libpipewire-module-rtkit.so \
libpipewire-module-rtp-sap.so \
libpipewire-module-rtp-session.so \
libpipewire-module-rtp-sink.so \
libpipewire-module-rtp-source.so \
libpipewire-module-session-manager.so \
libpipewire-module-snapcast-discover.so \
libpipewire-module-spa-device-factory.so \
libpipewire-module-spa-device.so \
libpipewire-module-spa-node-factory.so \
libpipewire-module-spa-node.so \
libpipewire-module-vban-recv.so \
libpipewire-module-vban-send.so \
libpipewire-module-zeroconf-discover.so \
libpw-v4l2.so \
pipewire-modules \
pipewire-modules-0-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libffado.so.2 \
libglib-2.0.so.0 \
libm.so.6 \
libopus.so.0 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libselinux.so.1"

inherit rpm
