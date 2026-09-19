SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python314-zope.deprecation-6.0-1.4.noarch.rpm"
RPM_HASH = "a5091a2961b002c27d7837786eb61f6cc3db20dfacb9a0f19b850953a510f6211662e0b93ff853b8b890556962e0ddd19161802d5eb1c3154c0c1bcda4565f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.deprecation \
python314-zope.deprecation \
python3dist-zope.deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
