SUMMARY = "Graphical User Interface for the laptop mode tools"
DESCRIPTION = "This package contains a graphical user interface for laptop-mode-tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.74"

RPM_NAME = "laptop-mode-tools-gui-1.74-3.17.noarch.rpm"
RPM_HASH = "f84af41e77f7fa7ce11d930b7acc1a156ba712f10d5a97a831b015c6435a74ff1487ded82823950098afdf17a1853bd4e5757c3e742d021c3b4aa721da75b350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "laptop-mode-tools-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
laptop-mode-tools \
python3-qt5"

inherit rpm
