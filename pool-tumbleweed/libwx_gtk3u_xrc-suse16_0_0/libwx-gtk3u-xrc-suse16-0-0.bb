SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_xrc-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "d884cbd5e8192cc91991338d48a6019b2ed2e394c3da7b192132dbfe77c0abc488a060a59571c3a97ea6a22983f27a95336d508ae5a2ac851b34af00d0253cc7"

RPROVIDES:${PN} += "libwx-gtk3u-xrc-suse.so.16.0.0 \
libwx-gtk3u-xrc-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0"

inherit rpm
