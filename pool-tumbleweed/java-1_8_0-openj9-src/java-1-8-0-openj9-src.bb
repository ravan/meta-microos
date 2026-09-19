SUMMARY = "OpenJDK 8 Source Bundle"
DESCRIPTION = "The OpenJDK 8 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "1.8.0.504"

RPM_NAME = "java-1_8_0-openj9-src-1.8.0.504-1.1.aarch64.rpm"
RPM_HASH = "6c48c13fe8633c37bf8c143893b3b721b8cefc8043811874f2ce0d2ff211e39bf8de3e8cbda219dc9a632c6946b4ed838580bfcaad64b65206a336a3249eee19"

RPROVIDES:${PN} += "java-1-8-0-openj9-src"

RDEPENDS:${PN} += "java-1-8-0-openj9"

inherit rpm
