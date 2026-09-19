SUMMARY = "Share a single keyboard and mouse between multiple computers"
DESCRIPTION = "Deskflow is a free and open source keyboard and mouse sharing app. Use the \
keyboard, mouse, or trackpad of one computer to control nearby computers, and \
work seamlessly between them. It's like a software KVM (but without the video). \
TLS encryption is enabled by default. Wayland is supported. Clipboard sharing \
is supported."
LICENSE = "GPL-2.0-only & MIT & SUSE-GPL-2.0-with-openssl-exception & LGPL-2.1-only"

PV = "1.26.0"

RPM_NAME = "deskflow-1.26.0-2.3.aarch64.rpm"
RPM_HASH = "b0eaf9a134573798c1502420c1c4b989db96c24c110cb18faff016ec187f34450e55bdde43aa4bca9bf9269f968af164fa62d25c9084e84e5582d4973bd2b9ca"

RPROVIDES:${PN} += "deskflow"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXtst.so.6 \
libc.so.6 \
libcrypto.so.3 \
libei.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libportal.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libxkbcommon.so.0 \
libxkbfile.so.1"

inherit rpm
