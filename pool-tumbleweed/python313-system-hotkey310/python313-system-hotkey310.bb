SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python313-system-hotkey310-1.0.5-2.5.noarch.rpm"
RPM_HASH = "486b6c0b805155d2c905c74b0a4a69450036a88444b85a14b54d9e2f8a79edfc5b5afdcaf8831ef7f08547a799e48ad1a62c42f3ec134c903fcdfa1f902b2c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-system-hotkey310 \
python3.13dist-system-hotkey310 \
python313-system-hotkey310 \
python3dist-system-hotkey310"

RDEPENDS:${PN} += "python-abi \
python313-xcffib \
python313-xpybutil"

inherit rpm
