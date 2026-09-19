SUMMARY = "A command-line tool to manage Loki"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation \
system inspired by Prometheus. \
 \
This package contains the lokitool command-line tool."
LICENSE = "Apache-2.0"

PV = "3.7.7"

RPM_NAME = "lokitool-3.7.7-1.1.aarch64.rpm"
RPM_HASH = "c27a606698480b496731a6ed723146a395bf2ad95a6285320bde66cbc9fd06dbac1053ff5b76d6e64f89623fb294d5b6a0cf7764c84f7a54502ec697861f83ac"

RPROVIDES:${PN} += "lokitool"

RDEPENDS:${PN} += ""

inherit rpm
