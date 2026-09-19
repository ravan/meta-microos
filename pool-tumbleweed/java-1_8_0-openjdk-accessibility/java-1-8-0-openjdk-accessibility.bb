SUMMARY = "OpenJDK 8 accessibility connector"
DESCRIPTION = "Enables accessibility support in OpenJDK 8 by using java-atk-wrapper. \
This allows compatible at-spi2 based accessibility programs to work \
for AWT and Swing-based programs. \
 \
Please note, the java-atk-wrapper is still in beta, and OpenJDK 8 \
itself is still being tuned to be working with accessibility features. \
There are known issues with accessibility on, so please do not install \
this package unless you really need to."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "1.8.0.504"

RPM_NAME = "java-1_8_0-openjdk-accessibility-1.8.0.504-1.1.aarch64.rpm"
RPM_HASH = "896a2f006e732b9361aee57716faec288d5ac717bbbe9ff408ffe90282cc45d2c7c658d80ded849da956c08c17d9236bb391ff59617ca1766a77cfa5b2b49052"

RPROVIDES:${PN} += "config-java-1-8-0-openjdk-accessibility \
java-1-8-0-openjdk-accessibility"

RDEPENDS:${PN} += "/usr/bin/sh \
java-1-8-0-openjdk \
java-atk-wrapper"

inherit rpm
