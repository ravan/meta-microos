SUMMARY = "An image viewer with vim-like keybindings"
DESCRIPTION = "Vimiv is an image viewer with vim-like keybindings. \
 \
- Basic image operations and navigation \
- ranger-like library to browse your images \
- Thumbnail mode: navigable grid of image previews \
- Command mode with tab-completion \
- Search with pattern matching \
- Simple mark and tag system"
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "vimiv-qt-0.9.0-1.8.aarch64.rpm"
RPM_HASH = "633a36aadc1429f9c39eaadc4e09205c2807ee3cef3ad4fab3ba3598c97459857fc8585fdad742024fc36d5036b77c796543c370f18a4fa3d8286e7335a63f81"

RPROVIDES:${PN} += "python3.13dist-vimiv \
python3dist-vimiv \
vimiv-qt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-qt5"

inherit rpm
