SUMMARY = "An OBS source service: running all the osc source-validator checks"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This service runs all checks as required by openSUSE:Factory project. This can be used \
to guarantee that all checks succeed also on the service side. This plugin can be \
used via project wide defined services."
LICENSE = "GPL-2.0-or-later"

PV = "0.47+1"

RPM_NAME = "obs-service-source_validator-0.47+1-1.1.noarch.rpm"
RPM_HASH = "6306d14def0e3c85cd6870651173231f9471e5fa642878a9e5d05b3984166f24b80053781899623890fa55e48c729deaea215a89963024c104efe45cb94a66b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-source-validator \
osc-source-validator \
perl-DebianSourceChangesValidator"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/cpio \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/xmllint \
build \
bzip2 \
diffutils \
git-core \
gpg2 \
patch \
perl \
perl-TimeDate \
unzip \
xz \
zstd"

inherit rpm
