SUMMARY = "Multi-producer-multi-consumer signal dispatching mechanism"
DESCRIPTION = "Dispatcher mechanism for creating event models. \
 \
PyDispatcher is an enhanced version of Patrick K. O’Brien’s original \
dispatcher.py module. It provides the Python programmer with a robust \
mechanism for event routing within various application contexts. \
 \
Included in the package are the robustapply and saferef modules, which \
provide the ability to selectively apply arguments to callable objects and \
to reference instance methods using weak-references."
LICENSE = "BSD-3-Clause"

PV = "2.0.7"

RPM_NAME = "python314-PyDispatcher-2.0.7-2.5.noarch.rpm"
RPM_HASH = "58072d50fc6a89a8d819631a03d35290580e0a647f273b2e96d05d7d4e12d6c13321f71f0f0ecd7c8fffaa2c606f936694ba2e6355cddefb91651948b93176da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydispatcher \
python314-PyDispatcher \
python3dist-pydispatcher"

RDEPENDS:${PN} += "python-abi"

inherit rpm
