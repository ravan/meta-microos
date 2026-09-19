SUMMARY = "Utility belt for automated testing in python for python"
DESCRIPTION = "A testing library for python with powerful and flexible assertions. Sure is \
heavily inspired by should.js"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "python314-sure-2.0.1-4.4.noarch.rpm"
RPM_HASH = "923b43ba923adce7ae33e1a64fc1b2ba3b46c2de1726e1ca2a2871f9fccbeccd3a6cc9428004d85f1f1517dcdcf45f4cc94b5c97f23aa81a0922e8f2b4936b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sure \
python314-sure \
python3dist-sure"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-six"

inherit rpm
