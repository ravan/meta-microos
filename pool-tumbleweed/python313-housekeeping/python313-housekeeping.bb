SUMMARY = "Decorators for managing deprecations in Python projects"
DESCRIPTION = "A small library providing decorators and helpers for managing \
deprecations of functions, methods, parameters and modules across the \
lifecycle of a Python project."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python313-housekeeping-1.1-1.2.noarch.rpm"
RPM_HASH = "b015fb36b7925feca1e1dd6cdf9094c12f59f086ecbf96b09caa0c13bf2366e214b6cad5fdf1b94b8554908a8fd112ad84b045decd195091731b4191a90a3528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-housekeeping \
python3.13dist-housekeeping \
python313-housekeeping \
python3dist-housekeeping"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
