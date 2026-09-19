SUMMARY = "A pyunit extension to output JUnit compatible XML"
DESCRIPTION = "A Python unittest TestResult that outputs JUnit compatible XML."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "python314-junitxml-0.7-5.10.noarch.rpm"
RPM_HASH = "e1600afe8a8af990c06faa8bd5d8ef2bba416cf3aad5695938993a7b70f6482a6d97e9a6bc0bb265a0e9ece8cef3a6b309fc473dbdb7dcf820058a327638e58b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-junitxml \
python314-junitxml \
python3dist-junitxml"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
