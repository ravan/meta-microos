SUMMARY = "Supportconfig Analysis Pattern Base Libraries"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance pattern base libraries used \
by all patterns"
LICENSE = "GPL-2.0-only"

PV = "1.6.2"

RPM_NAME = "sca-patterns-base-1.6.2-1.4.noarch.rpm"
RPM_HASH = "6135228168d8593bb26ac8963647a5b2065f44e585a92b90262988077874613ba8077ce66884b1928c384ef8cba64b13ab3ba49c197406576297368e8fdecb0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SDP--Core \
perl-SDP--SUSE \
sca-patterns-base \
sca-patterns-template-gen2"

RDEPENDS:${PN} += "bash \
perl \
python3-base"

inherit rpm
