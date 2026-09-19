SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_xrc-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "b448a634c2c5aa524f36069b8cc06657deeac6133d73dbd042f4c9ed957482017685fa8e6e465a54c88af441518dce4f41470707023b329a11935be83ebba2a3"

RPROVIDES:${PN} += "libwx-gtk3u-xrc-suse-nostl.so.16.0.0 \
libwx-gtk3u-xrc-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-baseu-xml-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0 \
libwx-gtk3u-html-suse-nostl.so.16.0.0"

inherit rpm
