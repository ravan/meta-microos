SUMMARY = "Python bindings for libmsym"
DESCRIPTION = "This package contains the python bindings needed to develop \
python applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python314-libmsym-0.2.3-4.3.noarch.rpm"
RPM_HASH = "b5ec193929946f272c5f5ac39e8dcdc289ee17df7324d24a052b1c495c561407dc018aa80da18d4e5edb5ae95097363db488174cb4f3f69452764ef9f17eed1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-libmsym \
python314-libmsym \
python3dist-libmsym"

RDEPENDS:${PN} += "python-abi"

inherit rpm
