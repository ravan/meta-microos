SUMMARY = "Tool for checking /bin/sh scripts for possible bashisms"
DESCRIPTION = "checkbashisms performs basic checks on /bin/sh shell scripts for \
the possible presence of bashisms. It takes the names of the shell \
scripts on the command line, and outputs warnings if possible \
bashisms are detected.*"
LICENSE = "GPL-2.0-or-later"

PV = "2.26.9"

RPM_NAME = "checkbashisms-2.26.9-1.3.noarch.rpm"
RPM_HASH = "8856d083905c34744c7e5575396aabbeca593591a043f99a06dfc916703f4e8d77307adbd04ccfb4ab8a934b82dd5cfd0afb048ef51fdafbd8dde2ecc8e62890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checkbashisms \
deb-/usr/bin/checkbashisms \
devscripts-/usr/bin/checkbashisms"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
