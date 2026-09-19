SUMMARY = "Job scheduling module for Python"
DESCRIPTION = "An in-process scheduler for periodic jobs that uses the builder \
pattern for configuration. Schedule lets the user run Python functions \
(or any other callable) periodically at pre-determined intervals."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python313-schedule-1.2.2-1.2.noarch.rpm"
RPM_HASH = "bfc9e61ea1ab39b78da0daaea05661ffd69ba3d3e0c702c292f88edbebbfea94b82b17b28fd5c3ab2507610e4bfb44722a20bf99b011808bd3604bc810913e51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-schedule \
python3.13dist-schedule \
python313-schedule \
python3dist-schedule"

RDEPENDS:${PN} += "python-abi"

inherit rpm
