SUMMARY = "wxWidgets Rich Text editor class library"
DESCRIPTION = "wxRichTextCtrl provides a generic implementation of a rich text \
editor that can handle different character styles, paragraph \
formatting, and images. It is intended for 'natural' text in the \
sense that source code is better served by wxStyledTextCtrl."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk2u_richtext-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "e742d71bc164ba372d623de69682a049c89565ca4a86da6a6951de436ccfff63ac7c6254fbe499f4fd62bf72cdccd06d8640f0241b500f1705541f1fc80ec199"

RPROVIDES:${PN} += "libwx-gtk2u-richtext-suse.so.16.0.0 \
libwx-gtk2u-richtext-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0"

inherit rpm
