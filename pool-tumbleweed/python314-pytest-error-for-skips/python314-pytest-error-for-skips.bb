SUMMARY = "Pytest plugin to treat skipped tests a test failure"
DESCRIPTION = "Pytest plugin to treat skipped tests a test failures. \
 \
This is nice if you want to ensure that your CI tests \
really run all tests and don't skip tests because of \
missing dependencies."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python314-pytest-error-for-skips-2.0.2-2.5.noarch.rpm"
RPM_HASH = "b5854b6e378f20ffb191394593e13be3fe234994c9a5770ae387999b571d1afe967a78686641090f4070f480c55d197e2185fdf408a03f6ae43c5683d67ce51d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-error-for-skips \
python314-pytest-error-for-skips \
python3dist-pytest-error-for-skips"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
