SUMMARY = "Qt-based plaintext editor"
DESCRIPTION = "FeatherPad is a plain-text editor. It is independent of any desktop environment and has: \
* Drag-and-drop support, including tab detachment and attachment; \
* X11 virtual desktop awareness (using tabs on current desktop but opening a new window on another); \
* An optional permanent search bar with a different search entry for each tab; \
* Instant highlighting of found matches when searching; \
* A docked window for text replacement; \
* Support for showing line numbers and jumping to a specific line; \
* Automatic detection of text encoding as far as possible and optional saving with encoding; \
* Syntax highlighting for common programming languages; \
* Printing; \
* Text zooming; \
* Non-interrupting prompts;"
LICENSE = "GPL-3.0-only"

PV = "1.6.4"

RPM_NAME = "featherpad-1.6.4-1.2.aarch64.rpm"
RPM_HASH = "31db678a8bc6b9f6cc09ced61987ab1d14ff30676555a478a43429ffe52a209e31722a7b4214502c14ac0b49fbdc58b24216805834be018268b98fbb7e8a2479"

RPROVIDES:${PN} += "featherpad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
