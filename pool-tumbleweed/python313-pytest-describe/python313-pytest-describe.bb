SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python313-pytest-describe-2.2.0-2.5.noarch.rpm"
RPM_HASH = "ffba7244ecce87964be554c1ed4b5a7e74a523fe1b14b762cf3bcb0bd55a68ec2d8e4e8dcf56172053b08f5f0fb60c5dab56eba8cdaffa7d7450eaeeb9dca99d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-describe \
python3.13dist-pytest-describe \
python313-pytest-describe \
python3dist-pytest-describe"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
