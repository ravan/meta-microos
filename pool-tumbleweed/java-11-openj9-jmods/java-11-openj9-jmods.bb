SUMMARY = "JMods for OpenJDK 11"
DESCRIPTION = "The JMods for OpenJDK 11."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openj9-jmods-11.0.32.1-1.1.aarch64.rpm"
RPM_HASH = "83dc0f425e9b3a0651d674650beb1dc1fedc551d25cb0c8aac55ea35c8403c418fd570cd09c8fa842db3da010ca56c4e5b40e8569f230a5f33425d3612519db4"

RPROVIDES:${PN} += "java-11-openj9-jmods"

RDEPENDS:${PN} += "java-11-openj9-devel"

inherit rpm
