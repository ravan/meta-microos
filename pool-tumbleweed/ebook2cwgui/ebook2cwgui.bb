SUMMARY = "GUI for ebook2cw"
DESCRIPTION = "A graphical user interface (GUI) for ebook2cw. The GUI uses the same \
configuration file as ebook2cw, called ebook2cw.conf."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2"

RPM_NAME = "ebook2cwgui-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "b668760b9bc51631daf383e73ac056f49f1b80338227bf7b6df33cced3d644a622a5c40f0a5cf52a1b2670f3de266031752a3b9e5b95b06c316f20860fca72a5"

RPROVIDES:${PN} += "ebook2cwgui"

RDEPENDS:${PN} += "ebook2cw \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
