SUMMARY = "A Python module for JavaScript-like message boxes"
DESCRIPTION = "A pure Python module for JavaScript-like message boxes."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python314-PyMsgBox-1.0.9-2.5.noarch.rpm"
RPM_HASH = "e80a7900c15fc48c6e6bede254484a8c2ef7d94be46e168c87966ab51906fe4699fde420ffb76adb712d7ee75ba7d0343b59266295a82c192970bb81a8201235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymsgbox \
python314-PyMsgBox \
python3dist-pymsgbox"

RDEPENDS:${PN} += "python-abi"

inherit rpm
