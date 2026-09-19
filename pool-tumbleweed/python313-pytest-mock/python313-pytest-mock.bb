SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.15.1"

RPM_NAME = "python313-pytest-mock-3.15.1-1.5.noarch.rpm"
RPM_HASH = "ec93d8a4ee267e21d50bd780008afe067203c9ac0c0abfb05eb833b79deb4caf24a2223fb59a1a7a991cb5add9126040a10ba3da00aaaaee4d60ad134a0a3b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-mock \
python3.13dist-pytest-mock \
python313-pytest-mock \
python3dist-pytest-mock"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
