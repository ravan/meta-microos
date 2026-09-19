SUMMARY = "OpenJDK 11 Demos"
DESCRIPTION = "The OpenJDK 11 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openj9-demo-11.0.32.1-1.1.aarch64.rpm"
RPM_HASH = "392a41f3f82a959c0510e7361ea5a09a52fb210310ae64711bd04521b59e01897455dc56ad19ee1ed0fc25b089b1a309719b56226c9f69d0cccdca794f8160f7"

RPROVIDES:${PN} += "java-11-openj9-demo"

RDEPENDS:${PN} += "java-11-openj9"

inherit rpm
