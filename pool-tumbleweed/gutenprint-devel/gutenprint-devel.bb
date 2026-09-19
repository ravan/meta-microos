SUMMARY = "Development environment for Gutenprint"
DESCRIPTION = "The development environment for the Gutenprint printer drivers. \
See the developers guide to Gutenprint at /usr/share/gutenprint/doc/gutenprint.pdf"
LICENSE = "GPL-2.0-or-later"

PV = "5.3.5"

RPM_NAME = "gutenprint-devel-5.3.5-1.5.aarch64.rpm"
RPM_HASH = "1d6fc92b9b2447673f1c6cc08f6d37813aa63f5601ba76669f9c9280b85594eaf16b8c151e3075c9d8fee993732325f6ffb759c72e79683e525f9e1b601eb2e6"

RPROVIDES:${PN} += "gutenprint-devel \
pkgconfig-gutenprint"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cups \
ghostscript \
glibc-devel \
gutenprint"

inherit rpm
