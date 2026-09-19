SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.15.1"

RPM_NAME = "python314-pytest-mock-3.15.1-1.5.noarch.rpm"
RPM_HASH = "31985f33594180805f50c0ec3cf7c88d738a5eafcbd0cfc376c15b62e98e65771b09e2461acaa85ffc7c0b25f982b03b45c661ba08bafe1f9c2ae062d15ecb4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-mock \
python314-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
