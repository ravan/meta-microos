SUMMARY = "Development files for the Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the development files required to build \
indicators and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.4"

RPM_NAME = "libayatana-indicator-devel-0.9.4-2.4.aarch64.rpm"
RPM_HASH = "4ef0d8f068e671d17a69803f84f746a93b18a67d4f400ba5d6752c79c41a4f54e9f3075a71d56f13c2876daf98ccf338227871e54ff4400278b1bfa708a1a009"

RPROVIDES:${PN} += "libayatana-indicator-devel \
pkgconfig-ayatana-indicator-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-indicator7 \
pkgconfig-gtk+-2.0"

inherit rpm
