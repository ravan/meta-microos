SUMMARY = "Graphical frontend for diff"
DESCRIPTION = "This is a diff front-end with a look and feel based on Atria Clearcase \
xcleardiff. Both files are displayed in a window each and the \
differences are marked in different colors. \
 \
 \
 \
Authors: \
-------- \
    John C. Quillan <quillan@doitnow.com>"
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "tkxcd-1.1.0-952.7.noarch.rpm"
RPM_HASH = "03c8606fc71f8c355ff3649ae0be7dd073c23a8de8be6e68cd4a268c662654044d1495052adcbc3869a19b2a7caf6607a2f5a7c75d3b0096386a5c62012d9ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tkxcd \
tkxcd-1.1.0"

RDEPENDS:${PN} += "/usr/bin/bash \
tk"

inherit rpm
