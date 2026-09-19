SUMMARY = "Python utility for removing commented-out code"
DESCRIPTION = "With modern revision control available, there is no reason to save \
commented-out code to your repository. 'eradicate' helps cleans up \
existing junk comments. It does this by detecting block comments that \
contain valid Python syntax that are likely to be commented out code. \
(It avoids false positives like the sentence 'this is not good', \
which is valid Python syntax, but is probably not code.)"
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-eradicate-3.0.1-1.4.noarch.rpm"
RPM_HASH = "a2a43128a3a3937fdd5c6a8b599ed6372dbfa9af8c1cffd01c1f5e6d63dc7e380ac312ee131c17c8f44b3ac30bf6b9770cda41ac02bdf24e423ac769f2af70e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-eradicate \
python314-eradicate \
python3dist-eradicate"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
