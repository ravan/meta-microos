SUMMARY = "Imlib 2 - development libraries"
DESCRIPTION = "These are the development headers and library for imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.12.7"

RPM_NAME = "imlib2-devel-1.12.7-1.1.aarch64.rpm"
RPM_HASH = "ba1121d38dd0a03263619f7514eda28465f903981b20c1eca69f261964719ac6add4562f88c33b979ddc0627a0455491750313d53d8a1b450c531ef145e2472b"

RPROVIDES:${PN} += "imlib2-devel \
pkgconfig-imlib2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libImlib2-1 \
xorg-x11-libX11-devel"

inherit rpm
