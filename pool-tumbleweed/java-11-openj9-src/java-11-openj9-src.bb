SUMMARY = "OpenJDK 11 Source Bundle"
DESCRIPTION = "The OpenJDK 11 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openj9-src-11.0.32.1-1.1.aarch64.rpm"
RPM_HASH = "bb36b15cc48c64064e41908da63b6aef0ee6d06f8695de605f880dc258cfe5f883991f56e36181edd52a5ff6681d3583194000af13b0d82e301746c7d71588a9"

RPROVIDES:${PN} += "java-11-openj9-src"

RDEPENDS:${PN} += "java-11-openj9"

inherit rpm
