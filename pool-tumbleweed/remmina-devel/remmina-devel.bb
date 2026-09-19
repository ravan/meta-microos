SUMMARY = "Development Files for remmina"
DESCRIPTION = "This package contains header files needed for developing plugins for \
Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-devel-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "081025263c304ea82ec65aa82edd8591b05a8bbd5771c9cab835f9986f73e66a65ccf0d60c50f0df8a56dc444f29801a511619ee6c2432c5599f35eaec4d969b"

RPROVIDES:${PN} += "pkgconfig-remmina \
remmina-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
remmina"

inherit rpm
