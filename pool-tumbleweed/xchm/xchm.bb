SUMMARY = "A wxWidgets CHM document viewer"
DESCRIPTION = "xCHM is a GUI frontend for CHMLIB, written with wxGTK. It is able to \
display the topics tree, work with displayed pages history, print the \
current page, work with bookmarks, change fonts and fast search \
through all the pages of the loaded .chm document."
LICENSE = "GPL-2.0-or-later"

PV = "1.39"

RPM_NAME = "xchm-1.39-1.2.aarch64.rpm"
RPM_HASH = "b52d1f68f4aefdf9c22252fd7edadddac7367babf274d82f8ea79f9fc05c24ea1ca354b5ce1888e1e0a216256b556749d886cbb496d25e713cb40ff15d1ec3c1"

RPROVIDES:${PN} += "xchm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchm.so.0 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-aui-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0"

inherit rpm
