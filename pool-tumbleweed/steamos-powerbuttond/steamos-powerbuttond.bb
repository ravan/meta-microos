SUMMARY = "Steam Deck power button daemon"
DESCRIPTION = "This package provides a Steam Deck power button daemon."
LICENSE = "BSD-2-Clause"

PV = "3.3"

RPM_NAME = "steamos-powerbuttond-3.3-2.4.aarch64.rpm"
RPM_HASH = "ccb1661b9cb6636d59ba98863630b4fbef4415bb028c48a3ef2c7beea3687a85f04f778925fd5ea9435e55d09483cc7cee1655e29d246b9205b44ed50136fe91"

RPROVIDES:${PN} += "steam-powerbuttond \
steamos-powerbuttond"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libevdev.so.2 \
libudev.so.1"

inherit rpm
