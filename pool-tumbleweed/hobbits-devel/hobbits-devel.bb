SUMMARY = "Development files for hobbits"
DESCRIPTION = "A GUI for bit-based analysis, processing, and visualization. \
 \
This subpackage contains files for developing applications thatwant to make use of hobbits."
LICENSE = "MIT"

PV = "0.55.0"

RPM_NAME = "hobbits-devel-0.55.0-1.3.aarch64.rpm"
RPM_HASH = "b400835aac6da007c4e9dbdfae21a31cc83392066f75abc9b4c3f26470be471ee30eb12fc351bc008be4cb100c489f0b1a9651b5f67e562d575b970711e4e441"

RPROVIDES:${PN} += "hobbits-devel"

RDEPENDS:${PN} += "hobbits"

inherit rpm
