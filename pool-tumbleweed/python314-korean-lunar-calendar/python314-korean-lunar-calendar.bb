SUMMARY = "Korean Lunar Calendar"
DESCRIPTION = "This is GUI for GPaste clipboard manager for Gnome Shell. It \
allows to paste, edit and search through clipboard history. GUI \
display can be toggled with keyboard shortcut so is easy to \
use without mouse."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python314-korean-lunar-calendar-0.3.1-2.5.noarch.rpm"
RPM_HASH = "aea2ba7ea2831186999e63165b3f86f73a023fc631747d52f8f85bb72fc1c03d3d8c4a28c645982bf874ca1d2a6689fc45afacfb01342558a4cf9222c0a6490a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-korean-lunar-calendar \
python314-korean-lunar-calendar \
python3dist-korean-lunar-calendar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
