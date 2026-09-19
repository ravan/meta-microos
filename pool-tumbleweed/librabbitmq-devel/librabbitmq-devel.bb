SUMMARY = "Header files and development libraries for rabbitmq-c"
DESCRIPTION = "This package contains the header files and development libraries \
for rabbitmq-c."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "librabbitmq-devel-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "2a570aa0958311af3a867a4442f7bdd6c308b45fba626367b405fdb1758c3fb84926fe32e7cc15ace3217d7794637c41e87b6c0ee924d3c7756fa77b344d1806"

RPROVIDES:${PN} += "cmake-rabbitmq-c \
librabbitmq-devel \
pkgconfig-librabbitmq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librabbitmq4"

inherit rpm
