SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python314-pathable-0.6.0-1.2.noarch.rpm"
RPM_HASH = "c03837388778f26ab3fd66c616a18efa40fe9a3fc3466e131be5c79092dc0aa971bafd44216cdfafc5a838751b20e9bf9638ca1f50fdecb386187fc6a4bcd4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pathable \
python314-dictpath \
python314-pathable \
python3dist-pathable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
