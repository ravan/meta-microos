SUMMARY = "Bluetooth Stack for Linux"
DESCRIPTION = "BlueZ provides support for the core Bluetooth layers and protocols."
LICENSE = "GPL-2.0-or-later"

PV = "5.82"

RPM_NAME = "bluez-5.82-2.4.aarch64.rpm"
RPM_HASH = "126a08f2935dd25bebf3332f16af725f7cc8c457947046a9f4a9720015ce5ed6b0025d131512b3f65a74550542839defb54dbe5db1c4ab6a282539de690861ff"

RPROVIDES:${PN} += "bluez \
bluez-audio \
bluez-hcidump \
bluez-utils \
config-bluez \
obexd-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdbus-1.so.3 \
libell.so.0 \
libglib-2.0.so.0 \
libjson-c.so.5 \
libreadline.so.8 \
libudev.so.1 \
systemd"

inherit rpm
