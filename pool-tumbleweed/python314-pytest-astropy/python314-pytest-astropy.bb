SUMMARY = "Meta-package containing dependencies for testing"
DESCRIPTION = "This is a meta-package that pulls in the dependencies that are used by \
astropy and some affiliated packages for testing. It can also be used for \
testing packages that are not affiliated with the Astropy project. \
 \
This package also provides pytest markers for cpu and memory intensive tests \
(`pytest.mark.slow` and `pytest.mark.hugemem`). Tests marked with those \
markers are not run by default, can be run with the other tests with \
`--run-slow` and `--run-hugemem`, and can be run separately with `-m slow` \
and `-m hugemem`."
LICENSE = "BSD-3-Clause"

PV = "0.11.0"

RPM_NAME = "python314-pytest-astropy-0.11.0-1.15.noarch.rpm"
RPM_HASH = "219ed003c973e0a810e65683fe1d5aa6593d362fa60394b00c2780d904833c53d2eea2e92e3c5f7d8afc2c3502944f4be8e844644dee53e58a8d62fbe55e6941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-astropy \
python314-pytest-astropy \
python3dist-pytest-astropy"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-hypothesis \
python314-pytest \
python314-pytest-arraydiff \
python314-pytest-astropy-header \
python314-pytest-cov \
python314-pytest-doctestplus \
python314-pytest-filter-subpackage \
python314-pytest-mock \
python314-pytest-remotedata"

inherit rpm
