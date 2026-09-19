SUMMARY = "GTK frontend for GPU Screen Recorder"
DESCRIPTION = "This is a screen recorder that has minimal impact on system performance \
by recording your monitor using the GPU only, similar to shadowplay on \
windows. This is the fastest screen recording tool for Linux. \
 \
This screen recorder can be used for recording your desktop offline, for \
live streaming and for nvidia shadowplay-like instant replay, where only \
the last few minutes are saved. \
 \
GTK frontend for GPU Screen Recorder."
LICENSE = "GPL-3.0-only"

PV = "20260805"

RPM_NAME = "gpu-screen-recorder-gtk-20260805-1.1.aarch64.rpm"
RPM_HASH = "2e7018a43e38fdc22196b61a8c1f49277a943f308334d658422686ccd592998c0e96ab83914d694b16e6e9eed5ac8a7e5432c5bd6b426f035a1ebb331be8bbd6"

RPROVIDES:${PN} += "gpu-screen-recorder-gtk"

RDEPENDS:${PN} += "gpu-screen-recorder \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libayatana-appindicator3.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6"

inherit rpm
