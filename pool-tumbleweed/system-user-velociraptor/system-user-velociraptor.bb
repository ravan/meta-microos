SUMMARY = "System user and group 'velociraptor'"
DESCRIPTION = "This package provides a shared system user for all velociraptor components"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-velociraptor-1.0.0-2.4.noarch.rpm"
RPM_HASH = "380401cd67e444dffebb02d6ffd8ce9663f47404d288c970ad08c869ecda4d080999251f07c69e84fd0cb2dbe3f078416bf46e646fced1e8612adfa61b2fee9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-velociraptor \
system-user-velociraptor \
user-velociraptor"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
