SUMMARY = "E-book reader"
DESCRIPTION = "A multi-platform ebook reader which supports popular ebook formats: \
ePub, fb2, mobi, rtf, html, plain text, and a lot of other formats. \
It provides access to popular network libraries that contain a large \
set of ebooks. Download books for free or for a fee. Add your own \
catalog. Highly customizable. Choose colors, fonts, page turning \
animations, dictionaries, bookmarks, etc. to make reading as \
convenient as you want."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.4"

RPM_NAME = "fbreader-0.99.4-5.4.aarch64.rpm"
RPM_HASH = "012c5afacaa2222e9536ca89e481458d34cea2b2bc78583695daec18a21341ea677c49c61486fbc36c029aad94f08af4e01a1f5a1c889917fcee356a15679a5c"

RPROVIDES:${PN} += "fbreader"

RDEPENDS:${PN} += "libc.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libzlcore.so.0.99 \
libzltext.so.0.99 \
libzlui.so.0.99"

inherit rpm
