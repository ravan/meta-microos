SUMMARY = "Services plugin for pytest testing framework"
DESCRIPTION = "The plugin provides a set of fixtures and utility functions to start service \
processes for your tests with pytest."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python313-pytest-services-2.2.2-1.3.noarch.rpm"
RPM_HASH = "6ccbfa8035d0b7083831f6caa7715930d1235eda840b9b9373f463346fd8b659142588b4438105804c2f48c0874ab2915f8fe1c779925a2184987157cd250388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-services \
python3.13dist-pytest-services \
python313-pytest-services \
python3dist-pytest-services"

RDEPENDS:${PN} += "python-abi \
python313-psutil \
python313-pytest \
python313-requests \
python313-setuptools \
python313-zc.lockfile"

inherit rpm
