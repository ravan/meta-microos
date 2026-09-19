SUMMARY = "Development files for libsidplayfp"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
use libsidplayfp."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.1"

RPM_NAME = "libsidplayfp-devel-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "1bfea80a2c30aa058e595dbacd7abfb6692d3c9017f8a145b28455744285270edd7047de245a56c3aaabf05331e11cef6aa2fab123dcae1249c4093fa19c056d"

RPROVIDES:${PN} += "libsidplayfp-devel \
pkgconfig-libsidplayfp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsidplayfp7"

inherit rpm
