SUMMARY = "LV2 documentation"
DESCRIPTION = "LV2 is a plugin standard for audio systems, similar in scope to LADSPA, \
VST, AU, and others. It defines a C API for code and a format for data files \
which collectively describe a plugin. LV2 consists of a core (roughly \
equivalent in power to LADSPA) which can be extended to support more \
functionality. \
This package contains the LV2 API documentation."
LICENSE = "ISC"

PV = "1.18.10"

RPM_NAME = "lv2-docs-1.18.10-3.11.noarch.rpm"
RPM_HASH = "4718a681102bdaffd7e83e4ce45068a69987cd4dbf2013465c798f3073435e17f76fb3ce2af6d163269ab6fc258d5732295724a13e1546d34880b563c9cf4515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lv2-docs"

RDEPENDS:${PN} += "lv2"

inherit rpm
