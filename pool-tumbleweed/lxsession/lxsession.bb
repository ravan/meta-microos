SUMMARY = "LXDE Session Manager, required for running the desktop environment"
DESCRIPTION = "LXSession is the standard session manager used by LXDE. The LXSession manager \
is used to automatically start a set of applications and set up a working desktop \
environment. Moreover, the session manager is able to remember the applications in \
use when a user logs out and to restart them the next time the user logs in."
LICENSE = "GPL-2.0-only"

PV = "0.5.5+56"

RPM_NAME = "lxsession-0.5.5+56-1.8.aarch64.rpm"
RPM_HASH = "82c4d7a0d3307ab48313da4f0b8aa23651b56335ecd43ff84d157d54f2bb0e9accd32700a9cb377af3610d4d4763b5bbfee2f33cd681dec828714daeede80fd9"

RPROVIDES:${PN} += "lxpolkit \
lxsession \
lxsession-edit"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
