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

RPM_NAME = "python313-urwid-4.0.11-1.1.noarch.rpm"
RPM_HASH = "4cd02198ed8baa83eb42b50353492708d72b5414b272b0f1b90a3ea981efa731ef843fe5d627afa7b2b788c32b6ba78942737755fa7c98eb8fde1055ffbde445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urwid \
python3.13dist-urwid \
python313-urwid \
python3dist-urwid"

RDEPENDS:${PN} += "python-abi \
python313-curses \
python313-typing-extensions \
python313-wcwidth"

inherit rpm
