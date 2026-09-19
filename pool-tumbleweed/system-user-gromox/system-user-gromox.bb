SUMMARY = "System user and group gromox"
DESCRIPTION = "This package provides: \
* the 'gromox' user identity for running Gromox services as \
* the 'gromox' group identity for marking data to be consumed by Gromox \
  services but possibly created by AAPI, e.g. mailbox contents \
* the 'gromoxcf' group identity for marking (possibly sensitive) \
  configuration, to be consumed by Gromox services and select \
  services (like saslauthd/keycloak dlopening pam_gromox.so)"
LICENSE = "MIT"

PV = "9"

RPM_NAME = "system-user-gromox-9-1.7.noarch.rpm"
RPM_HASH = "335383018f98da1483080932b9c434219440e5afe6123e94c4c65eedf40ebcc84a0ba8976023f3d00c74fe4591d4070c9a449cd184f23ebfc51339126756c708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-gromox \
group-gromoxcf \
system-user-gromox \
user-gromox"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
