SUMMARY = "A recording/broadcasting program - Development Files"
DESCRIPTION = "Devel files for OBS Studio is software designed for capturing, compositing, encoding, recording, and streaming video content, efficiently."
LICENSE = "GPL-2.0-or-later"

PV = "32.2.1"

RPM_NAME = "obs-studio-devel-32.2.1-2.1.aarch64.rpm"
RPM_HASH = "d411fcbc5affa3abfbb08fda11ace5b367e6873bb71231109eabc1f7d88a42874b156cb44716cf590745b904ef32b3cf0ae6dd0f89e8007b9efb042cb1846860"

RPROVIDES:${PN} += "cmake-libobs \
cmake-obs-frontend-api \
obs-studio-devel \
pkgconfig-libobs \
pkgconfig-obs-frontend-api"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
obs-studio"

inherit rpm
