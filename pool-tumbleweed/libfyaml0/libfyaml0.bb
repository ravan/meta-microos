SUMMARY = "YAML 1.2 parser and emitter"
DESCRIPTION = "A YAML parser and emitter. \
 \
* Support for YAML version 1.2, some support for 1.3. \
* Zero content copy operation; content is never copied to internal \
  structures. \
* Parser may be used in event mode (like libyaml) or in document \
  generating mode. \
* Programmable API for manipulating parsed YAML documents or \
  creating them from scratch. \
* YAML emitter with programmable options, supporting colored output. \
* printf/scanf-based YAML creation and data extraction API."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "libfyaml0-0.9.5-1.3.aarch64.rpm"
RPM_HASH = "a403c71c78334227e0e95f9418b1493b6dc8f8c6539a248cd9040726230d16e7c0456c7fc24cbbac950e3b8a0de54a78ef4dd4a2aea23fa93a04a02ce7f193b9"

RPROVIDES:${PN} += "libfyaml.so.0 \
libfyaml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
