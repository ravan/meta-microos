SUMMARY = "Apache configuration for bugzilla"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "MPL-2.0"

PV = "5.2"

RPM_NAME = "bugzilla-apache-5.2-1.6.noarch.rpm"
RPM_HASH = "822b319b967f4dff05197f572fa4665f91d6dde5e341d63ab39585696eab5e1320d7593c4bdfc75818f7af4c69379b34f9318c67cb40249e255bb5fbc4deeaa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bugzilla-apache \
config-bugzilla-apache"

RDEPENDS:${PN} += "apache2 \
apache2-mod-perl \
group-www \
user-wwwrun"

inherit rpm
