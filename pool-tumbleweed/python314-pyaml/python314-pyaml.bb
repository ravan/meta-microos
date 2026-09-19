SUMMARY = "Python module to produce formatted YAML-serialized data"
DESCRIPTION = "PyYAML-based python module to produce formatted YAML-serialized data."
LICENSE = "WTFPL"

PV = "26.7.0"

RPM_NAME = "python314-pyaml-26.7.0-1.1.noarch.rpm"
RPM_HASH = "75437d7cbf4e2a34809135510e937b311b791bd42417b787bedcc42c6cc70f9598868cfbd9d4405a5fe3a81316fb854adb3cfde4348abc8178c7d29abef8ebe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyaml \
python314-pyaml \
python3dist-pyaml"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
update-alternatives"

inherit rpm
