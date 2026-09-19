SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openjdk-src-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "e952b2acb7d1a3917bcdff33850afe45ed920c7c6f2737948938b24defdba5e75b10e5e5937765b93df2d2a0409655188a661c23ede8a4f6f69d79f49a1cbb9e"

RPROVIDES:${PN} += "java-17-openjdk-src"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
