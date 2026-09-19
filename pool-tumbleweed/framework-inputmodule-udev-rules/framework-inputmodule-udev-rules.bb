SUMMARY = "Inputmodule control udev rules"
DESCRIPTION = "Udev Rules for the Framework Laptop 16 Inputmodule"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "framework-inputmodule-udev-rules-0.2.0-3.8.aarch64.rpm"
RPM_HASH = "bac31ae933a6747c8829d576e92a374ece563979c0eeea2c38216df4df9dc02cd8e382fbb459b6b003e6569bad76fc290f4077744934a83a785b1118a64b0892"

RPROVIDES:${PN} += "framework-inputmodule-udev-rules"

RDEPENDS:${PN} += "/usr/bin/sh \
framework-inputmodule-control"

inherit rpm
