SUMMARY = "Pytest plugin for printing summary data as I want it"
DESCRIPTION = "Opinionated pytest plugin to make output slightly easier to read \
and errors easy to find and fix."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-pytest-pretty-1.3.0-1.5.noarch.rpm"
RPM_HASH = "7d42b7fa761ea2abbbb753d70318626bde2bddd5b267edacfed757a1e9d276428fb9815f6a29b0e863af13dbd1ae021dce874d2d697dfeb025f3802134d4db05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-pretty \
python3.13dist-pytest-pretty \
python313-pytest-pretty \
python3dist-pytest-pretty"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-rich"

inherit rpm
