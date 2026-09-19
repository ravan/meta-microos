SUMMARY = "OpenJFX development tools and libraries"
DESCRIPTION = "OpenJFX development tools and libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "17.0.20.0"

RPM_NAME = "openjfx-devel-17.0.20.0-2.1.aarch64.rpm"
RPM_HASH = "e87f2b7ee76eb5ecd5d180a5dbc3dc6bd3033a4d001a993ea2c05a9d5a8ac121a36045cda06cfaf1e9047c159db7a348f93652d539410235fb1f490a96ad0f04"

RPROVIDES:${PN} += "openjfx-devel"

RDEPENDS:${PN} += "openjfx"

inherit rpm
