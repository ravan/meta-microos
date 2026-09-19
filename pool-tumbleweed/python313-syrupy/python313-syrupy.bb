SUMMARY = "Pytest Snapshot Test Utility"
DESCRIPTION = "Syrupy is a [pytest](https://docs.pytest.org/en/latest/) snapshot plugin. It enables developers to write tests which assert immutability of computed results. \
 \
The most popular snapshot test plugin compatible with pytest has some core limitations which this package attempts to address by upholding some key values: \
 \
- Extensible: If a particular data type is not supported, users should be able to easily and quickly add support. \
- Idiomatic: Snapshot testing should fit naturally among other test cases in pytest, e.g. `assert x == snapshot` vs. `snapshot.assert_match(x)`. \
- Soundness: Snapshot tests should uncover even the most minute issues. Unlike other snapshot libraries, Syrupy will fail a test suite if a snapshot does not exist, not just on snapshot differences."
LICENSE = "MIT"

PV = "5.5.3"

RPM_NAME = "python313-syrupy-5.5.3-1.1.noarch.rpm"
RPM_HASH = "988bc76fa78fe5a38c4e454c60a359648437d89d97754163850a443f943fc0b1dfcc9e8a1a81bdcff1bb200c5e1f49f16f5f7929f35e3ae53a11e0fdb59454ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-syrupy \
python3.13dist-syrupy \
python313-syrupy \
python3dist-syrupy"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
