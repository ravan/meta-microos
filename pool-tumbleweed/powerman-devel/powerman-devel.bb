SUMMARY = "Headers and libraries for developing applications using PowerMan"
DESCRIPTION = "Header files, pkg-config file and man pages for developing applications using PowerMan."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "powerman-devel-2.4.4-3.3.aarch64.rpm"
RPM_HASH = "31788fcaadf13a5fe1a130d22d70bf487ca588272e479290d692af77194061a22420d62a98e03d2043b699e98fda4c151eebbb47ebd2678cd97a071a4af1061e"

RPROVIDES:${PN} += "pkgconfig-libpowerman \
powerman-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpowerman0"

inherit rpm
