SUMMARY = "Header file and libraries of KAKASI"
DESCRIPTION = "header file and libraries of KAKASI"
LICENSE = "GPL-2.0-or-later"

PV = "2.3.6"

RPM_NAME = "kakasi-devel-2.3.6-9.6.aarch64.rpm"
RPM_HASH = "fa3bb1b43990541d44a3f5b108b05ab1564a742ec72a8c836ee87d84cd21bcddaa69142404e7aeceff8a15c9755fa74e4bf2451742f7c872d31ded46dc65ba4c"

RPROVIDES:${PN} += "kakasi-devel \
kakaside"

RDEPENDS:${PN} += "kakasi"

inherit rpm
