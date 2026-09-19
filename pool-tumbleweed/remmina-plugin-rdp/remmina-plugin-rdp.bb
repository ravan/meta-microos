SUMMARY = "RDP Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-plugin-rdp-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "f38f6edae690c047201623a1570b10ca9ae62547d207ce01211e923f0041e85c1791098194b4c1dc5456eadb0c8c7d5e618da996cb8906838c0ea364e034fb29"

RPROVIDES:${PN} += "remmina-plugin-rdp"

RDEPENDS:${PN} += "freerdp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcups.so.2 \
libfreerdp-client3.so.3 \
libfreerdp3.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwinpr3.so.3 \
remmina"

inherit rpm
