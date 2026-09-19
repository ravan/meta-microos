SUMMARY = "Session / policy manager implementation for PipeWire"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire."
LICENSE = "MIT"

PV = "0.5.17"

RPM_NAME = "wireplumber-0.5.17-1.1.aarch64.rpm"
RPM_HASH = "95068452b3804ee05a2ecadba31d8c7bf755629bce5a48e543283b44c28654a382fd6c4fbc3d83f6566d5ea4f710d17ba3bb27b408e1c36af0e244b73eaabbf2"

RPROVIDES:${PN} += "libwireplumber-module-dbus-connection.so \
libwireplumber-module-default-nodes-api.so \
libwireplumber-module-file-monitor-api.so \
libwireplumber-module-log-settings.so \
libwireplumber-module-logind.so \
libwireplumber-module-lua-scripting.so \
libwireplumber-module-mixer-api.so \
libwireplumber-module-modem-manager.so \
libwireplumber-module-mpris.so \
libwireplumber-module-notifications-api.so \
libwireplumber-module-portal-permissionstore.so \
libwireplumber-module-reserve-device.so \
libwireplumber-module-settings.so \
libwireplumber-module-si-audio-adapter.so \
libwireplumber-module-si-node.so \
libwireplumber-module-si-standard-link.so \
libwireplumber-module-standard-event-source.so \
pipewire-session-manager \
wireplumber \
wireplumber-audio"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblua5.4.so.5 \
libm.so.6 \
libpipewire-0.3.so.0 \
libsystemd.so.0 \
libwireplumber-0.5.so.0 \
pipewire"

inherit rpm
