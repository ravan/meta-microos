SUMMARY = "Advanced configuration system"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of three parts: \
KConfigCore, KConfigGui and KConfigQml. \
 \
KConfigCore provides access to the configuration files themselves. It features: \
 \
- centralized definition: define your configuration in an XML file and use \
`kconfig_compiler` to generate classes to read and write configuration entries. \
 \
- lock-down (kiosk) support. \
 \
KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files. \
 \
KConfigQml provides QtQuick bindings to KConfig, allowing it to be used with QML."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kconfig-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "66fa5be69ddcc0c6f52b2f9bfd884d20fd189a11e93b8ee8a6f3a39e6ffbd10089d5a2bb7dea7a00a4ccceafb7182d9ade589444cba8bddbc874b935f25fef72"

RPROVIDES:${PN} += "kf6-kconfig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
