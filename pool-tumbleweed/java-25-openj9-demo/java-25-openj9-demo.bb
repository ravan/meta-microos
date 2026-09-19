SUMMARY = "OpenJDK 25 Demos"
DESCRIPTION = "The OpenJDK 25 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openj9-demo-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "56f97199ed1e1b96e80725bdf4fe741eeba19ee4ac224b1ffb3e194c4c4d477614e8594e50ff1b79db9185a1c3326697156c895341a414383ddb609d8ea132d0"

RPROVIDES:${PN} += "java-25-openj9-demo"

RDEPENDS:${PN} += "java-25-openj9"

inherit rpm
