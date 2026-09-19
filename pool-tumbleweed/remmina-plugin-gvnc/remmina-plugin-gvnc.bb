SUMMARY = "VNC Protocol Plugin for Remmina via GTK+ widget"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina using the \
VNC viewer widget for GTK+."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-plugin-gvnc-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "d247fc0ca38e9a4baf76de79f1024a87f65061d0abadbf40f9b1ad8a6b5388ea278548e05ffbe5856cc6365ca3f525c793eba10dea8ec1911b741de3f080d137"

RPROVIDES:${PN} += "remmina-plugin-gvnc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libgvnc-1.0.so.0 \
libgvncpulse-1.0.so.0 \
remmina"

inherit rpm
