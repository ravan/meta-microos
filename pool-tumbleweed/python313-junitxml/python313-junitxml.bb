SUMMARY = "A pyunit extension to output JUnit compatible XML"
DESCRIPTION = "A Python unittest TestResult that outputs JUnit compatible XML."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "python313-junitxml-0.7-5.10.noarch.rpm"
RPM_HASH = "3b708febfcedce83f27a447632274c5a113427534fa5f0b3ac85b21340821c7591d9972995da7ef655d015d8d1dee3a618b668de3fd904d2f980017aadf71b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-junitxml \
python3.13dist-junitxml \
python313-junitxml \
python3dist-junitxml"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
