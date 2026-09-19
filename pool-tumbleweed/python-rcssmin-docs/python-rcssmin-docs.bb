SUMMARY = "Documentation files for python-rcssmin"
DESCRIPTION = "HTML Documentation and examples for python-rcssmin."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python-rcssmin-docs-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "66867f87301b09371a2287c3b7cf3c5e11e78e223a8a4d61e3fff1c5f3277afe27e72e8d8684d205683ecb31691c2d00e0c0a660c38fce624fb9b08c8bc2c665"

RPROVIDES:${PN} += "python-rcssmin-docs"

RDEPENDS:${PN} += ""

inherit rpm
