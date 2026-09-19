SUMMARY = "Python bindings for framel, a gravitational wave frame data library"
DESCRIPTION = "The Frame Library is a software dedicated to frame data manipulation including \
file input/output. \
 \
This package provides the python bindings for framel."
LICENSE = "LGPL-2.1-or-later"

PV = "8.48.4"

RPM_NAME = "python314-framel-8.48.4-2.7.aarch64.rpm"
RPM_HASH = "62bec076ff6d98d47fc548f45d102cc39ab405cc09dcc195ccad53d16aeedddb4c28cbfc57cfdc67b9c10b6469f236ea025efa0a165b5599d38a842cd5ec4e8e"

RPROVIDES:${PN} += "python3.14dist-framel \
python314-framel \
python3dist-framel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
