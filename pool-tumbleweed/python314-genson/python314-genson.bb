SUMMARY = "Python JSON Schema generator"
DESCRIPTION = "GenSON is a JSON Schema generator. \
 \
Besides taking JSON objects and generating schemas that describe \
them, this generator is able to merge schemas as well."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-genson-1.3.0-1.6.noarch.rpm"
RPM_HASH = "9ceebc8ddd92ebb73e1dc56eca0ec8d9ae226802e6a79836cc981b7bfdcbb5ba22b0c3510a751b6e4f88e85b578a025b807b38141baaf0381ab8353fc78b00ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-genson \
python314-genson \
python3dist-genson"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
