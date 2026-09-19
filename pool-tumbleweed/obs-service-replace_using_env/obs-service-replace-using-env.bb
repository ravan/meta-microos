SUMMARY = "Service for variables substitution"
DESCRIPTION = "This service can be enabled to run during buildtime to replace the placeholders \
in the specified files with the values from the build environment."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "obs-service-replace_using_env-0.1-2.14.noarch.rpm"
RPM_HASH = "910d68c0dc5811f26483d1352ab54cb3cdb5a4a4d046e1a118611683b04d2fcf4cb951fcabf139f2e9b7138bbc9855db57debe6486ccbf88cc220dddd27a6ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-replace-using-env"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
sed"

inherit rpm
