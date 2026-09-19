SUMMARY = "Logging utilities"
DESCRIPTION = "The logutils package provides a set of handlers for the Python standard \
library's logging package. \
 \
Some of these handlers are out-of-scope for the standard library, and \
so they are packaged here. Others are updated versions which have \
appeared in recent Python releases, but are usable with older versions \
of Python and so are packaged here."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python313-logutils-0.3.5-7.9.noarch.rpm"
RPM_HASH = "cd43136c15526740b8b04bf0da03c35f93c82433705506ff23adf6903cd6e08852f47fdd615dba9a8c4d2e4b0564298baef7de718f6c9bcb1d3127a542a687e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logutils \
python3.13dist-logutils \
python313-logutils \
python3dist-logutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
