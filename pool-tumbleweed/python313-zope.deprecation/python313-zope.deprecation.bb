SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python313-zope.deprecation-6.0-1.4.noarch.rpm"
RPM_HASH = "a78007846fe5ca424c688f5344c6da7416a804be08147f314d92463ae4d7e1a3d7f024608849c307c10f7074f2206fa46a29faf61743d9eec89a18654cbe2a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.deprecation \
python3.13dist-zope.deprecation \
python313-zope.deprecation \
python3dist-zope.deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
