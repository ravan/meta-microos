SUMMARY = "matecomponent-based library for the MATE Panel Applet"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.1"

RPM_NAME = "libmate-panel-applet-4-1-1.28.1-2.14.aarch64.rpm"
RPM_HASH = "1de75f262446ec7c85b64e7b117027b5afdb096bad53b00fa65f5921b4fbf4ee23304880fdf94aed58d83e0b979764fd620e294b7ef5e4f3a2a0d0656ca529da"

RPROVIDES:${PN} += "libmate-panel-applet-4-1 \
libmate-panel-applet-4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
