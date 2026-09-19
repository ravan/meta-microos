SUMMARY = "Development package for the raptor library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
raptor library."
LICENSE = "Apache-2.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "2.0.16"

RPM_NAME = "libraptor-devel-2.0.16-5.8.aarch64.rpm"
RPM_HASH = "51d60cde22aeb160be17eda3b951d528f64ffc82593ee66e0dd50fff9eb444e9cabeb34d09b61dccc24232990b3d153d0e6476a65d20898884969d249b380119"

RPROVIDES:${PN} += "libraptor-devel \
pkgconfig-raptor2 \
raptor-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libraptor2-0 \
raptor"

inherit rpm
