SUMMARY = "WYSIWYG Ebook Editor"
DESCRIPTION = "Sigil is an editor for the EPUB format. It is designed for WYSIWYG \
editing of EPUB files and for converting other formats to EPUB. It \
also provides support for direct XHTML, CSS and XPGT editing. You can \
use it to add any of the metadata entries supported by the EPUB \
specification and create a hierarchical Table of Contents."
LICENSE = "GPL-3.0-only"

PV = "2.8.1"

RPM_NAME = "sigil-2.8.1-1.1.aarch64.rpm"
RPM_HASH = "a7ffd496ffcfe73997d343ba4e1bf382c6401ed8aada3992511db1703bf214ed49d4fc039a842180117ff86debb430d3585ab6fe870f0474e444799d6fa744ca"

RPROVIDES:${PN} += "libsigilgumbo.so \
sigil"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libminizip.so.1 \
libpcre2-16.so.0 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python313-Pillow \
python313-certifi \
python313-chardet \
python313-css-parser \
python313-cssselect \
python313-dulwich \
python313-html5lib \
python313-lxml \
python313-regex \
python313-six \
python313-urllib3"

inherit rpm
