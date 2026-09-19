SUMMARY = "GUI to control and monitor boinc-client"
DESCRIPTION = "The BOINC Manager is a graphical monitor and control utility for the BOINC \
core client. It gives a detailed overview of the state of the client it is \
monitoring. The BOINC Manager has two modes of operation, the 'Simple View' in \
which it only displays the most important information and the 'Advanced View' \
in which all information and all control elements are available."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "8.2.15"

RPM_NAME = "boinc-manager-8.2.15-2.1.aarch64.rpm"
RPM_HASH = "6b7917a2dfe6b4a3116cca13396752287309952e356a9486fbc4b0e11d056343dfea14047d585d06750275b01e7b43dea8b9f6d826ebc70ea2bf6c0b6f1587ed"

RPROVIDES:${PN} += "boinc-manager"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libboinc.so.8 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnotify.so.4 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0 \
libwx-gtk3u-webview-suse.so.16.0.0 \
libxcb.so.1"

inherit rpm
