SUMMARY = "Bash Helper Script That Handles dd_rescue"
DESCRIPTION = "dd_rhelp is a bash helper script that handles dd_rescue. dd_rescue roughly acts \
as the dd linux command with the caracteristic to NOT stop when it falls on \
read/write. \
 \
dd_rhelp intelligently controls dd_rescue to first copy all blocks from areas \
that work and only then tries to approach the bad spots from both sides."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "dd_rhelp-0.3.0-15.7.noarch.rpm"
RPM_HASH = "7430bc412f3988bf5be564a2773764d4dba2670ce495919b88ea9a1d5144bf60c5c1ac1fff0ae36abc53e83914b62ec04975ea6931f061c95577df5933012d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dd-rhelp"

RDEPENDS:${PN} += "/usr/bin/bash \
dd-rescue"

inherit rpm
