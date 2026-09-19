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

RPM_NAME = "python314-PyYAML-6.0.3-1.7.aarch64.rpm"
RPM_HASH = "20e084fc42e114f2878db3b284c10e42ac0274af9649ffe06dad9a385c63c0ad946e59f5b07b9be4a57810969dcbe4042100e14e65e51a6661106260cf5e6d4a"

RPROVIDES:${PN} += "python3.14dist-pyyaml \
python314-PyYAML \
python3dist-pyyaml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyaml-0.so.2 \
python-abi"

inherit rpm
