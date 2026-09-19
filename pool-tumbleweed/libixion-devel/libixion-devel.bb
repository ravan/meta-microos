SUMMARY = "Threaded multi-target formula parser & interpreter"
DESCRIPTION = "Ixion is a general purpose formula parser & interpreter that can calculate \
multiple named targets, or 'cells'."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "libixion-devel-0.20.0-4.7.aarch64.rpm"
RPM_HASH = "0d1083c2733350ecbb82b0275bf35419b1a38553fc36316d3fad995e5ec33a5a420518b4be60c847fbded2ae1356b822342254c6929dba61dd78b1af4baf422c"

RPROVIDES:${PN} += "libixion-devel \
pkgconfig-libixion-0.20"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libixion-0-20-0"

inherit rpm
