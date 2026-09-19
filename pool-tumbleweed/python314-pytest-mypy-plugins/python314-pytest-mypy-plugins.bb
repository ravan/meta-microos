SUMMARY = "pytest plugin for mypy plugins"
DESCRIPTION = "pytest plugin for writing tests for mypy plugins"
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python314-pytest-mypy-plugins-4.0.3-1.1.noarch.rpm"
RPM_HASH = "92ed82526b0b714bab580050a5e5b0c27b9f2db5a7e79c673f64874806402ac475b8de266563b368861d026af87a777322387f24f4df7916756b7ed0e227c2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-mypy-plugins \
python314-pytest-mypy-plugins \
python3dist-pytest-mypy-plugins"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-PyYAML \
python314-decorator \
python314-jsonschema \
python314-mypy \
python314-packaging \
python314-pytest \
python314-regex \
python314-tomlkit"

inherit rpm
