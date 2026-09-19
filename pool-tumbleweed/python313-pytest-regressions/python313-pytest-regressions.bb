SUMMARY = "Python fixtures to write regression tests"
DESCRIPTION = "Python fixtures to write regression tests."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "python313-pytest-regressions-2.10.0-1.2.noarch.rpm"
RPM_HASH = "1400de2c9470e680763b34b4d7ca2430c442fa00f57b5f5cb65a88b2447c3487392de794f502f93db1449b0da913a5c2eaafa3f5da0d7cadd7cd9c9b30137b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-regressions \
python3.13dist-pytest-regressions \
python313-pytest-regressions \
python3dist-pytest-regressions"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-pytest \
python313-pytest-datadir"

inherit rpm
