SUMMARY = "pytest plugin for mypy plugins"
DESCRIPTION = "pytest plugin for writing tests for mypy plugins"
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python313-pytest-mypy-plugins-4.0.3-1.1.noarch.rpm"
RPM_HASH = "eb8b60b9087f6719bf09c74017733593806623ae630382fe8ce875b8e26433420d9e10e77de181eeaa31718aa47d1883d8a2d3ac412b34d8b69ece996c8961bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mypy-plugins \
python3.13dist-pytest-mypy-plugins \
python313-pytest-mypy-plugins \
python3dist-pytest-mypy-plugins"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-PyYAML \
python313-decorator \
python313-jsonschema \
python313-mypy \
python313-packaging \
python313-pytest \
python313-regex \
python313-tomlkit"

inherit rpm
