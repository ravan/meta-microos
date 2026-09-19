SUMMARY = "Python module for ANSI color output and colored highlighting and diffing"
DESCRIPTION = "Ansicolor is a library that offers ANSI color markup for \
command line programs."
LICENSE = "Apache-2.0"

PV = "0.3.3"

RPM_NAME = "python314-ansicolor-0.3.3-1.4.noarch.rpm"
RPM_HASH = "b948ca699aacd8e10af4d1522cf6ae2cde9eabafdacb15ac9284fc645f46c8338a04d39ea23d72a1cb18bf58144b5e5afd54d77d7a7525e2325c58ab7e48c111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ansicolor \
python314-ansicolor \
python3dist-ansicolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
