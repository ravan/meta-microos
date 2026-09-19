SUMMARY = "Example scripts for herbstluftwm"
DESCRIPTION = "Sample bash scripts for herbstluftwm and herbstclient, which give the user \
an idea of what is possible."
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "herbstluftwm-examples-0.9.6-1.3.noarch.rpm"
RPM_HASH = "1140c37be50183403870d8c63ac0228d97c9c5597f1c5ce636af642720389d30f41d39b31fb580d670770c76d28a673490c00a8aaac28229f8c78a88221bc6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
herbstluftwm"

inherit rpm
