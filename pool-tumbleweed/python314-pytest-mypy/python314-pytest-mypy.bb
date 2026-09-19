SUMMARY = "Mypy static type checker plugin for Pytest"
DESCRIPTION = "Mypy static type checker plugin for Pytest."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-pytest-mypy-1.0.1-1.5.noarch.rpm"
RPM_HASH = "e30accefe4425bf19a52e020cb358069b0e9c50381882e59804f9fbcd5d538b843130000eeab641acdfad6910c44a0292b830e9952ec01d37256d3480b0cef4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-mypy \
python314-pytest-mypy \
python3dist-pytest-mypy"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-filelock \
python314-mypy \
python314-pytest"

inherit rpm
