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

RPM_NAME = "python314-apipkg-3.0.2-2.5.noarch.rpm"
RPM_HASH = "f3ab5dad9d2b7167ad35f3400cb960fecc8cdb6dee3f3bb0ba372f4d899a35166f29316b2569d56e16a3efd31a8bf1002d2d48538f1cb254d5e899eb064742cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apipkg \
python314-apipkg \
python3dist-apipkg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
