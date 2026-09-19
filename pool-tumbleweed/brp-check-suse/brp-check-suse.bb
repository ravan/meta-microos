SUMMARY = "Build root policy check scripts"
DESCRIPTION = "This package contains all suse scripts called in the \
build root checking or in parts implementing SUSE policies."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20260317.a0eb4ba"

RPM_NAME = "brp-check-suse-84.87+git20260317.a0eb4ba-1.3.aarch64.rpm"
RPM_HASH = "4ce4bee8f4cad43be161c73d373f1fb1ef06fa6812532a42ad160406c40b772d99a0eb10d21f3f0334613d0bc1bbdd38d78c32e048477dbf9d1cf3670fd96086"

RPROVIDES:${PN} += "brp-check-suse"

RDEPENDS:${PN} += "perl"

inherit rpm
