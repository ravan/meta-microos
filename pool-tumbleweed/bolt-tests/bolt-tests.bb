SUMMARY = "Installed tests for bolt"
DESCRIPTION = "Installed tests for bolt, compatible with gnome-desktop-testing-runner."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.11"

RPM_NAME = "bolt-tests-0.9.11-2.1.aarch64.rpm"
RPM_HASH = "6437b3aa9b51e3ea2a29cfe9dea4550fc04cfc42419eb95874d3c73dd9e81d7670dc33667e8e85110d29833ead09d88c5184c4f91717db26f197ec16ec7f811b"

RPROVIDES:${PN} += "bolt-tests"

RDEPENDS:${PN} += "/usr/bin/python3 \
bolt \
gnome-desktop-testing \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
python3-dbusmock \
umockdev"

inherit rpm
