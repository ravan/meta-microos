SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "9.0.3"

RPM_NAME = "python314-pytest-9.0.3-1.2.noarch.rpm"
RPM_HASH = "4a576b733ccbcb8a41da96e2f33f25bf8aca6a329367af9fe220f81bfa16801fd249489b2792b048d54091a0891b7ddbb76a54f29be977772b4d902557e30d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest \
python314-pytest \
python3dist-pytest"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Pygments \
python314-iniconfig \
python314-packaging \
python314-pluggy \
python314-setuptools"

inherit rpm
