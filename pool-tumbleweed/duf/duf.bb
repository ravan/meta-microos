SUMMARY = "Disk Usage/Free Utility"
DESCRIPTION = "Disk Usage/Free Utility (Linux, BSD, macOS & Windows)"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "duf-0.9.1-1.8.aarch64.rpm"
RPM_HASH = "5586c2f0c962f56dae8d120a3cc6bd14c731fe1900232de492aac3f8e72b8ad1e7abf4e6d26d4edd772ca139719565258c7e65e4c0acfcc8110c7cf218789f1c"

RPROVIDES:${PN} += "duf"

RDEPENDS:${PN} += ""

inherit rpm
