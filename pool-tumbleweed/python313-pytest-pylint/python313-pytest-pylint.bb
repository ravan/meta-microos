SUMMARY = "A pytest plugin to check source code with pylint"
DESCRIPTION = "pytest plugin to check source code with pylint. Run pylint with pytest and have \
configurable rule types (i.e. Convention, Warn, and Error) fail the build. You \
can also specify a pylintrc file."
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "python313-pytest-pylint-0.21.0-2.4.noarch.rpm"
RPM_HASH = "d1a6bddf81d20638127e445d3107de3a92d3db4feca8c59f99019d3c7d8c5c1cc930177c8b3ef0b14b98710ef1b5c058ba7c8a6ddcbc237031a02793727c8e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-pylint \
python3.13dist-pytest-pylint \
python313-pytest-pylint \
python3dist-pytest-pylint"

RDEPENDS:${PN} += "python-abi \
python313-pylint \
python313-pytest"

inherit rpm
