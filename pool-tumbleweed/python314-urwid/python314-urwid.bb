SUMMARY = "A full-featured console (xterm et al.) user interface library"
DESCRIPTION = "Urwid is a console user interface library.  It includes many features \
useful for text console application developers including: \
- Applications resize quickly and smoothly \
- Automatic, programmable text alignment and wrapping \
- Simple markup for setting text attributes within blocks of text \
- Powerful list box with programmable content for scrolling all widget types \
- Your choice of event loops: Twisted, Glib or built-in select-based loop \
- Pre-built widgets include edit boxes, buttons, check boxes and radio buttons \
- Display modules include raw, curses, and experimental LCD and web displays \
- Support for UTF-8, simple 8-bit and CJK encodings \
- 256 and 88 color mode support \
- Python 3.2 support"
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.11"

RPM_NAME = "python314-urwid-4.0.11-1.1.noarch.rpm"
RPM_HASH = "4c7800bc998063dd883502aa1253eb069f8c9c00e9c38bc69902dc4448b98f14d9f6a081287906c38fda11ee30d7511fb55b80e73b2b4c4da24c5955d0c71e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-urwid \
python314-urwid \
python3dist-urwid"

RDEPENDS:${PN} += "python-abi \
python314-curses \
python314-typing-extensions \
python314-wcwidth"

inherit rpm
