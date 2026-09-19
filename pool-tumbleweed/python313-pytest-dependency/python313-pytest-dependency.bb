SUMMARY = "Manage dependencies of tests"
DESCRIPTION = "This pytest plugin manages dependencies of tests.  It allows to mark \
some tests as dependent from other tests.  These tests will then be \
skipped if any of the dependencies did fail or has been skipped."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python313-pytest-dependency-0.6.1-1.2.noarch.rpm"
RPM_HASH = "0315cdf3e2b9340d9b7c7ac27b906ba8ca93d7a3639d1ed0441c0ad06c4c3e19ccd4954af8ed43abdb587b0df02e155d9ce54b4a9e853d5a26f2383aa5d2aa08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-dependency \
python3.13dist-pytest-dependency \
python313-pytest-dependency \
python3dist-pytest-dependency"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
