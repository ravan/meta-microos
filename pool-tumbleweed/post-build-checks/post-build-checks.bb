SUMMARY = "post checks for build after rpms have been created"
DESCRIPTION = "some scripts to check for problems like test-installing the newly \
created rpms and checking the logfile for errors. \
 \
This package will also set/change the following sysconfig variables, so \
it may not be a good idea to install this to a running system: \
/etc/sysconfig/security:PERMISSION_SECURITY='secure' \
/etc/sysconfig/clock:TIMEZONE='UTC'"
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20260421.8ed5e73"

RPM_NAME = "post-build-checks-84.87+git20260421.8ed5e73-1.1.noarch.rpm"
RPM_HASH = "8470d5d3d9fc89f2099439a5360210d0db9811c962a768ffcd0a786d9e1ea0ecfaf100962d329a1c8618e935cabca1b21c55f10fc1847ffbc6f4a2f628cb71f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-RPMQ \
post-build-checks"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
aaa-base \
aaa-base-malloccheck \
gawk \
permissions \
sed"

inherit rpm
