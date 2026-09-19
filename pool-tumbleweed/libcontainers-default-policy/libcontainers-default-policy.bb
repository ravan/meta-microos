SUMMARY = "Default containers policy.json"
DESCRIPTION = "This package ships the default /usr/share/containers/policy.json"
LICENSE = "Apache-2.0"

PV = "20260521"

RPM_NAME = "libcontainers-default-policy-20260521-1.1.noarch.rpm"
RPM_HASH = "424fb127f8f6be1fc93bcac948e6d1803396223d64b3dd2c6222bd69e9d7fe29f8456bfa7cae9fed94fc1650bfb2ab6cce78021883ffd2d9470cd563ba6ad799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcontainers-default-policy \
libcontainers-policy"

RDEPENDS:${PN} += ""

inherit rpm
