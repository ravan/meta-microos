SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_xrc-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "a6e430059db95fc69d22912ba37971cbc6c523e4a050059091f127157302d5c57c9a4ac3567506d470ebe8c6b7ba3a70b39f3d4411c9dbe94633af606f1d40e9"

RPROVIDES:${PN} += "libwx-gtk2u-xrc-suse.so.16.0.0 \
libwx-gtk2u-xrc-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0"

inherit rpm
