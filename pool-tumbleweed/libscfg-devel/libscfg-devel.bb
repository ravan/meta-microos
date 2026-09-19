SUMMARY = "Development files for libscfg"
DESCRIPTION = "This package provides the header file and the pkg-config metadata file."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libscfg-devel-0.1.1-1.9.aarch64.rpm"
RPM_HASH = "eb0a7897cd6bf37d63de2894556cd264811b49e3ec3276ac9c391fcffe02e10af00cb1afa753eb4c4955fa8b1d38e50a1680925f930f0d85e76fef31b71b9405"

RPROVIDES:${PN} += "libscfg-devel \
pkgconfig-scfg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libscfg1"

inherit rpm
