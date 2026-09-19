SUMMARY = "Python log in json format"
DESCRIPTION = "A formatter for python logging that outputs json log"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "python314-jsonformatter-0.3.4-1.8.noarch.rpm"
RPM_HASH = "57a439603e008ad4d05967d770930db4e1637b9e66cde36d5e387a958d633c88d9d3698b2d83335c02498568257e1e62a12f761f2ed262fbb0fbc15e81d16926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonformatter \
python314-jsonformatter \
python3dist-jsonformatter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
