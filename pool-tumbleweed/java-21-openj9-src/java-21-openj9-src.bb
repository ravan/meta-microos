SUMMARY = "OpenJDK 21 Source Bundle"
DESCRIPTION = "The OpenJDK 21 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openj9-src-21.0.12.1-1.1.aarch64.rpm"
RPM_HASH = "5d16119d76d973fc6bae28660373ff0bd6c01713e5d32862e87db86e486d189126d497a3c69dbe231139938e9612a93b900dcf716114572bfc4cc8e332f1d4f6"

RPROVIDES:${PN} += "java-21-openj9-src"

RDEPENDS:${PN} += "java-21-openj9"

inherit rpm
