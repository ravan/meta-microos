SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12"

RPM_NAME = "startup-notification-devel-0.12-17.9.aarch64.rpm"
RPM_HASH = "efa59790a26bad2d9b9ff98d8f8fdefabc30083908c6ff57863aaa6a197dba320ff749c3f69b9b38bff5955a0d79a8ea4280417b0931c4f18a5c27679281cf88"

RPROVIDES:${PN} += "pkgconfig-libstartup-notification-1.0 \
startup-notification-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstartup-notification-1-0"

inherit rpm
