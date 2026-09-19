SUMMARY = "Prevents swayidle from sleeping while outputting or receiving audio"
DESCRIPTION = "Prevents swayidle from sleeping while any application is outputting or receiving audio. Should work with all Wayland desktops that support the zwp_idle_inhibit_manager_v1 protocol but only tested in Sway \
This only works for Pulseaudio / Pipewire Pulse"
LICENSE = "GPL-3.0-or-later"

PV = "0.1.1"

RPM_NAME = "SwayAudioIdleInhibit-0.1.1-1.9.aarch64.rpm"
RPM_HASH = "af3e5b377309c91e7b0f3fa1257d4b9df1f1f59a17da4fa77f7cdc804f1eabaf10ad7fee0d103493f3b4c1adb29f0e2541d196d0dd2b14b9d4ef7c0f26989628"

RPROVIDES:${PN} += "SwayAudioIdleInhibit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpulse.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
pipewire-pulseaudio"

inherit rpm
