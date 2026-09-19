SUMMARY = "wxWidgets Rich Text editor class library"
DESCRIPTION = "wxRichTextCtrl provides a generic implementation of a rich text \
editor that can handle different character styles, paragraph \
formatting, and images. It is intended for 'natural' text in the \
sense that source code is better served by wxStyledTextCtrl."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "libwx_gtk3u_richtext-suse16_0_0-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "af0f195258f89c7b59950b4c1f35590b8eff6b0341a44515d0966cc5ebcb8f4a5e7cba0c13a012d69775b9e78729468a9b29c95d6357aaae5c4c389f30d35a77"

RPROVIDES:${PN} += "libwx-gtk3u-richtext-suse.so.16.0.0 \
libwx-gtk3u-richtext-suse16-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0"

inherit rpm
