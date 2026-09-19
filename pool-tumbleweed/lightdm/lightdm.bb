SUMMARY = "Lightweight, Cross-desktop Display Manager"
DESCRIPTION = "LightDM is a lightweight, cross-desktop display manager. Its main \
features are a well-defined greeter API allowing multiple GUIs, \
support for all display manager use cases, with plugins where \
appropriate, low code complexity, and fast performance. Due to its \
cross-platform nature greeters can be written in several toolkits \
such as Qt and GTK+."
LICENSE = "GPL-3.0-or-later"

PV = "1.32.0"

RPM_NAME = "lightdm-1.32.0-9.4.aarch64.rpm"
RPM_HASH = "0181921e1557625f622c7e76cc08862f84606cdd0f570413bf51ebf425a0319b49b203784ffe575bc07ebd5d798dfebb5ec7bf3a368ddff51f70f06312ee0567"

RPROVIDES:${PN} += "config-lightdm \
group-lightdm \
lightdm \
user-lightdm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libXdmcp.so.6 \
libaudit.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpam.so.0 \
libxcb.so.1 \
lightdm-greeter \
sysuser-shadow \
update-alternatives \
xdm"

inherit rpm
