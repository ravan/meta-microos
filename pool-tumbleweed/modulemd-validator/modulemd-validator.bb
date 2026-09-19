SUMMARY = "Tool for validating modulemd data"
DESCRIPTION = "The modulemd-validator tool provides the facility for verifying \
constructed modulemd data is correct and usable."
LICENSE = "MIT"

PV = "2.15.2"

RPM_NAME = "modulemd-validator-2.15.2-2.3.aarch64.rpm"
RPM_HASH = "da09d51b88b9d61e4a60c6d2d70820aed8a18807ad2c68813ebe60a790de75c1d39bbf6419be3c5f4ea3083790e106d10f8ba487509db2721f035c9ab7888f15"

RPROVIDES:${PN} += "modulemd-validator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmodulemd.so.2 \
libmodulemd2 \
libyaml-0.so.2"

inherit rpm
