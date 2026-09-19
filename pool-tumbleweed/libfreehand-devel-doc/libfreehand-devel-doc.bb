SUMMARY = "Documentation for the libfreehand API"
DESCRIPTION = "This package contains documentation for the libfreehand API."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-devel-doc-0.1.2-2.29.noarch.rpm"
RPM_HASH = "a30d73e966a8b00779664fc023111fda1eabf10219e970518a1110cbaaea9c759dedda0fa654b4f634d007f0fdd92c3b5cd9c32ff5b989f10999546cb1a2e3c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfreehand-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
