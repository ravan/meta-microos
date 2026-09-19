SUMMARY = "Python tool to find and list requirements of a Python project"
DESCRIPTION = "Requirements-detector is a Python tool which attempts to find and list \
the requirements of a Python project. \
 \
When run from the root of a Python project, it will try to ascertain \
which libraries and the versions of those libraries that the project \
depends on."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python314-requirements-detector-1.5.0-1.3.noarch.rpm"
RPM_HASH = "c5e039fef5317419e7638c496a0ed61d3187f31b8aee1641623d4b5c8c85fc669448fa2aaff055e546ebd948b9f1818dff1440b0e5e1df7a7f37c50f3809e992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requirements-detector \
python314-requirements-detector \
python3dist-requirements-detector"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-astroid \
python314-packaging \
python314-semver \
update-alternatives"

inherit rpm
