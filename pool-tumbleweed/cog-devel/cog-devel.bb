SUMMARY = "Development files for cog"
DESCRIPTION = "Cog is a small single “window” launcher for the WebKit WPE port. It \
provides no user interface, and is suitable to be used as a Web application \
container. The “window” may be fullscreen depending on the WPE backend \
being used."
LICENSE = "MIT"

PV = "0.18.5"

RPM_NAME = "cog-devel-0.18.5-3.5.aarch64.rpm"
RPM_HASH = "0f83b97056a21bf998eafb001940df3af6e4dc19ee5b65c1c787e30bea9f31ebcedbb81cc4c9cce0f5d0bbd4dd7af26aa7101ba858d2c7a96ac686146dcf3bf1"

RPROVIDES:${PN} += "cog-devel \
pkgconfig-cogcore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cog \
pkgconfig-manette-0.2 \
pkgconfig-wpe-webkit-2.0"

inherit rpm
