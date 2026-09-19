SUMMARY = "Vala bindings to libmirage"
DESCRIPTION = "libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package contains the Vala bindings to libmirage"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "libmirage-vala-3.3.2-2.1.noarch.rpm"
RPM_HASH = "bb5531015d63a03da3101d6fc83922d4e86ccb8d955fd8e3df804b5dd5bbb6c2e42e9ad4850d694c1c9412313aab6c7adb410fa584fe9d989f5fd309b03b1e67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmirage-vala"

RDEPENDS:${PN} += ""

inherit rpm
