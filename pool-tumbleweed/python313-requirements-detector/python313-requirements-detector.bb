SUMMARY = "Python tool to find and list requirements of a Python project"
DESCRIPTION = "Requirements-detector is a Python tool which attempts to find and list \
the requirements of a Python project. \
 \
When run from the root of a Python project, it will try to ascertain \
which libraries and the versions of those libraries that the project \
depends on."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python313-requirements-detector-1.5.0-1.3.noarch.rpm"
RPM_HASH = "1beb62bb55d8043daff94466db776f31472b56614db69cd407349bb927e258be30689ce8f48e9ba45f14919a2d660d46226e9dd8228adc3d5bed7c71e3004fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requirements-detector \
python3.13dist-requirements-detector \
python313-requirements-detector \
python3dist-requirements-detector"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-astroid \
python313-packaging \
python313-semver \
update-alternatives"

inherit rpm
