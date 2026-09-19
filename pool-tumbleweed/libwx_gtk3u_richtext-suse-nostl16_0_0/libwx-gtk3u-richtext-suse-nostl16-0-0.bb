SUMMARY = "wxWidgets Rich Text editor class library"
DESCRIPTION = "wxRichTextCtrl provides a generic implementation of a rich text \
editor that can handle different character styles, paragraph \
formatting, and images. It is intended for 'natural' text in the \
sense that source code is better served by wxStyledTextCtrl."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_richtext-suse-nostl16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "bfbbfda1c7f5c191aebf23c78c8782e3226cf769e4e7f520f6d1920ad362953b24d9d7d8b6ce2b9919568f7a1741d14e85dca5203b999055fc283592dc7638f9"

RPROVIDES:${PN} += "libwx-gtk3u-richtext-suse-nostl.so.16.0.0 \
libwx-gtk3u-richtext-suse-nostl16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-baseu-xml-suse-nostl.so.16.0.0 \
libwx-gtk3u-core-suse-nostl.so.16.0.0 \
libwx-gtk3u-html-suse-nostl.so.16.0.0"

inherit rpm
