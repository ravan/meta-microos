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

RPM_NAME = "python313-pytest-astropy-0.11.0-1.15.noarch.rpm"
RPM_HASH = "5a6b09f8d0def9d41353958baebb0fe7ac1e96f7cca40d6da263ea1373b029b1eac778550579956889d13636d017e4b648fcf78060f33aaff8617844da72ed36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-astropy \
python3.13dist-pytest-astropy \
python313-pytest-astropy \
python3dist-pytest-astropy"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-hypothesis \
python313-pytest \
python313-pytest-arraydiff \
python313-pytest-astropy-header \
python313-pytest-cov \
python313-pytest-doctestplus \
python313-pytest-filter-subpackage \
python313-pytest-mock \
python313-pytest-remotedata"

inherit rpm
