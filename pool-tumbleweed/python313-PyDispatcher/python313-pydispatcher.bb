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

RPM_NAME = "python313-PyDispatcher-2.0.7-2.5.noarch.rpm"
RPM_HASH = "a2175aff91033d33c4853ab08cd7563bfcd14b6b7c6da28dcd125b4e19619b3efc97f78aff7116e9f4846649962dd595e4f376d93ba1aafce71f1ee86ad89d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyDispatcher \
python3.13dist-pydispatcher \
python313-PyDispatcher \
python3dist-pydispatcher"

RDEPENDS:${PN} += "python-abi"

inherit rpm
