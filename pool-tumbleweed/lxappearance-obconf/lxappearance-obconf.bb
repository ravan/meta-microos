SUMMARY = "Lxappearance Plugin to Configure Openbox"
DESCRIPTION = "ObConf is a program used to configure OpenBox window manager developed \
by Dana Jansens, Tim Riley, and Javeed Shaikh. LXAppearance is a tool \
used to configure look and feels of the desktop written by Hong Jen Yee \
for LXDE project. This plugin is derived from ObConf as an attempt to \
integrate obconf with LXAppearance to provide a better user experience. \
Most of the source code are taken from ObConf written by its authors \
with some modifications added by LXAppearance developers to make it a \
plugin."
LICENSE = "GPL-2.0"

PV = "0.2.3"

RPM_NAME = "lxappearance-obconf-0.2.3-1.36.aarch64.rpm"
RPM_HASH = "6b8a57c2359c7895f4d3ef5336f1389c77eeeddb36afde070384e7bfe448f550acb62316e6d36e5afb5e12529e409140f9f507f6e2d3ddbaf8b90b5f9d173bc1"

RPROVIDES:${PN} += "lxappearance-obconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libobrender.so.32 \
libobt.so.2 \
libxml2.so.16 \
lxappearance \
openbox"

inherit rpm
