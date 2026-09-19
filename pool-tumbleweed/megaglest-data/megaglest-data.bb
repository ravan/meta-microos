SUMMARY = "Data files for MegaGlest"
DESCRIPTION = "Data files required for playing MegaGlest."
LICENSE = "CC-BY-SA-3.0"

PV = "3.13.0"

RPM_NAME = "megaglest-data-3.13.0-1.23.noarch.rpm"
RPM_HASH = "e36095d684fcb2073b6d540a4900aac5c739ae2efcd393f044f220d63cf85863e6238b7f92f5a78b64fd76dac0c9eedad725465d3e6913ae6980d7b8592843b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "megaglest-data"

RDEPENDS:${PN} += "/usr/bin/sh \
megaglest"

inherit rpm
