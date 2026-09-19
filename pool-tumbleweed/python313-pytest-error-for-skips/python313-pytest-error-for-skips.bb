SUMMARY = "Pytest plugin to treat skipped tests a test failure"
DESCRIPTION = "Pytest plugin to treat skipped tests a test failures. \
 \
This is nice if you want to ensure that your CI tests \
really run all tests and don't skip tests because of \
missing dependencies."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python313-pytest-error-for-skips-2.0.2-2.5.noarch.rpm"
RPM_HASH = "df1940005a305a00bd6bf9d10e6bdea875c5e0319b8751c5467173df9d9e95e37281140274bfe5aa833140257d7f0f644bf6ea0378ea06f94b6238d1f1332165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-error-for-skips \
python3.13dist-pytest-error-for-skips \
python313-pytest-error-for-skips \
python3dist-pytest-error-for-skips"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
