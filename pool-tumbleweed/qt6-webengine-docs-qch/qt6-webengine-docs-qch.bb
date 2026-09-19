SUMMARY = "Documentation for qt6-webengine in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webengine in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-webengine-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4b42425ab588b3d49fb97b97a1138a4dee5309cbd6daeff8b3f61a8677f606469ec0dc132b8a0691331645a0351630cc63c13b902bb06178fe8404980db69a3d"

RPROVIDES:${PN} += "qt6-webengine-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
