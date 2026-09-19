SUMMARY = "Decorators for managing deprecations in Python projects"
DESCRIPTION = "A small library providing decorators and helpers for managing \
deprecations of functions, methods, parameters and modules across the \
lifecycle of a Python project."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python314-housekeeping-1.1-1.2.noarch.rpm"
RPM_HASH = "7fb1c0ab73de2aa9c6ddf6c444657c62350554bb156fda5127fdc0d39888750d55893d96ce6234b2af2a19d9f32467cb65a7aa8dacfc77566a0ed7f6dc8b50c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-housekeeping \
python314-housekeeping \
python3dist-housekeeping"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
