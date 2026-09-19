SUMMARY = "Mypy static type checker plugin for Pytest"
DESCRIPTION = "Mypy static type checker plugin for Pytest."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-pytest-mypy-1.0.1-1.5.noarch.rpm"
RPM_HASH = "cffdaee6bbbc5ab6d3f48a9e44d33523c0ba095b610aff24e7d5e69ba7ce68144ec2ce431abdbc15ef681223cdff0b2be4dceb85f948f40284d48ec3cc41d8e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mypy \
python3.13dist-pytest-mypy \
python313-pytest-mypy \
python3dist-pytest-mypy"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-filelock \
python313-mypy \
python313-pytest"

inherit rpm
