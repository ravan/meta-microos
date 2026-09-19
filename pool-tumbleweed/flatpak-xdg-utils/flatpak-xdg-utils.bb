SUMMARY = "Command-line tools for use inside Flatpak sandboxes"
DESCRIPTION = "This package contains a number of command-line utilities for use inside \
Flatpak sandboxes. They work by talking to portals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.6"

RPM_NAME = "flatpak-xdg-utils-1.0.6-1.8.aarch64.rpm"
RPM_HASH = "8aaa2695edad2047422de290fbbe8be4f3f8bdf06c8421ee6a567f3b0132a63782d56b060b734a4e9d5aad15c31801cd64dc082d953adcf95bc2aac19caabc54"

RPROVIDES:${PN} += "flatpak-xdg-utils"

RDEPENDS:${PN} += "flatpak-spawn \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
