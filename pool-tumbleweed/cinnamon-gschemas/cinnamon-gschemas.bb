SUMMARY = "GNU/Linux Desktop featuring a traditional layout -- GSchemas"
DESCRIPTION = "This package provides GSettings schemas for \
Cinnamon Desktop Environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "6.4.6"

RPM_NAME = "cinnamon-gschemas-6.4.6-3.6.aarch64.rpm"
RPM_HASH = "525a9d96becbd180264700806b9f3d29e94b5b980053196c85a6d7acccc3542e8fc65e54e7401c73a45c3113d4dc0eebf8275c15f409260d74230ca8faa66c78"

RPROVIDES:${PN} += "cinnamon-gschemas"

RDEPENDS:${PN} += "cinnamon-gschemas-branding"

inherit rpm
