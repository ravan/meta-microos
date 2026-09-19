SUMMARY = "A library for reading/writing binary plists"
DESCRIPTION = "biplist is a binary plist parser/generator for Python. \
 \
Binary Property List (plist) files provide a faster and smaller serialization \
format for property lists on OS X. This is a library for generating binary \
plists which can be read by OS X, iOS, or other clients."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python313-biplist-1.0.3-5.10.noarch.rpm"
RPM_HASH = "061c0b143f885d7299cf35f124381d04bc24f28da85c31447fdbac5aeba33046a00ef76f767279d426ae57edcf96162267ac7c6c684ec3272355e9dd635b5811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-biplist \
python3.13dist-biplist \
python313-biplist \
python3dist-biplist"

RDEPENDS:${PN} += "python-abi"

inherit rpm
