SUMMARY = "System user 'ntpd-rs' and 'ntpd-rs-observe'"
DESCRIPTION = "A full-featured implementation of the Network Time Protocol, \
including support for NTS (Network Time Security). \
 \
This subpackage sets up the system user/group for the rest of ntpd-rs."
LICENSE = "Apache-2.0 | MIT"

PV = "1.9.0"

RPM_NAME = "ntpd-rs-common-1.9.0-1.4.noarch.rpm"
RPM_HASH = "4322a84356cfa9ebb1572de40dceca8cd0a8feda22f557ed20cd37d43909b979e678f182a84199fd5a38203b56181137eabc84e28ed1a163b35f0bade4ab59d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-ntpd-rs \
group-ntpd-rs-observe \
ntpd-rs-common \
user-ntpd-rs \
user-ntpd-rs-observe"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
