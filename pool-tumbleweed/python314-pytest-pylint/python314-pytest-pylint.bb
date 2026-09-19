SUMMARY = "A pytest plugin to check source code with pylint"
DESCRIPTION = "pytest plugin to check source code with pylint. Run pylint with pytest and have \
configurable rule types (i.e. Convention, Warn, and Error) fail the build. You \
can also specify a pylintrc file."
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "python314-pytest-pylint-0.21.0-2.4.noarch.rpm"
RPM_HASH = "456ca9c0c9faa0a1506d26ba13366c2903be842b2ae49b6373f273343540a5e2b7a6a00a1d9ded423d3eec5b1ee407289c0e72daede489f4b36cd56795852d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-pylint \
python314-pytest-pylint \
python3dist-pytest-pylint"

RDEPENDS:${PN} += "python-abi \
python314-pylint \
python314-pytest"

inherit rpm
