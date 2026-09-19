SUMMARY = "YAML parser and emitter for Python"
DESCRIPTION = "YAML is a data serialization format designed for human readability \
and interaction with scripting languages. PyYAML is a YAML parser \
and emitter for Python. \
 \
PyYAML features a complete YAML 1.1 parser, Unicode support, pickle \
support, capable extension API, and sensible error messages. PyYAML \
supports standard YAML tags and provides Python-specific tags that \
allow to represent an arbitrary Python object. \
 \
PyYAML is applicable for a broad range of tasks from complex \
configuration files to object serialization and persistance."
LICENSE = "MIT"

PV = "6.0.3"

RPM_NAME = "python313-PyYAML-6.0.3-1.7.aarch64.rpm"
RPM_HASH = "7ccd2bdd6113a950b946f5471f2a55319b5731899f991abfcc179f3a182467c1dfdd86cec75be0158dd8419bf995a87e5a106700b309a242ea57636ddb3f2ffc"

RPROVIDES:${PN} += "python3-PyYAML \
python3.13dist-pyyaml \
python313-PyYAML \
python3dist-pyyaml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyaml-0.so.2 \
python-abi"

inherit rpm
