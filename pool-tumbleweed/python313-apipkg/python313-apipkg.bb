SUMMARY = "Namespace control and lazy-import mechanism"
DESCRIPTION = "With apipkg you can control the exported namespace of a \
python package and greatly reduce the number of imports for your users. \
It is a small pure python module that works on CPython 2.7 and 3.4+, \
Jython and PyPy.  It co-operates well with Python's help() system, \
custom importers (PEP302) and common command line completion tools. \
 \
Usage is very simple: you can require 'apipkg' as a dependency or you \
can copy paste the ~200 lines of code into your project."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python313-apipkg-3.0.2-2.5.noarch.rpm"
RPM_HASH = "7acbe26cdc12b6450b083170480d54f51dfd031df93530ff44fad04c11e03b0b6fa9cc5a47e72eacf94117f9097aead0d3a9426e25c835d4edd56a31db93d89d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apipkg \
python3.13dist-apipkg \
python313-apipkg \
python3dist-apipkg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
