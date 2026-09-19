SUMMARY = "GUI to control Hammerfall HDSP settings"
DESCRIPTION = "HDSPConf is a GUI to control the Hammerfall HDSP Alsa Settings. \
Up to four hdsp cards are supported."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "hdspconf-1.4-29.4.aarch64.rpm"
RPM_HASH = "0c462afb938a9626cb1289d7041c5cd81defb82a1580cd99f11e4057b8aa69b1d2185c1aa8f69a01ac780cc90f2f5516202e05ce16d7ca69f7326441a9aa42d3"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/hdspconf \
hdspconf"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfltk.so.1.3 \
libstdc++.so.6"

inherit rpm
