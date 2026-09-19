SUMMARY = "A collection of tweening / easing functions"
DESCRIPTION = "A collection of tweening / easing functions implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python314-PyTweening-1.2.0-2.5.noarch.rpm"
RPM_HASH = "28077e3ec7a657f3d9e320a2c2e95974eaec3414e698379ea0e62e97a02a991c3e048aaac5f1e0e768e6d309bdac03e9ba89c11db6ae3223d3ab24bc1dcc12bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytweening \
python314-PyTweening \
python3dist-pytweening"

RDEPENDS:${PN} += "python-abi"

inherit rpm
