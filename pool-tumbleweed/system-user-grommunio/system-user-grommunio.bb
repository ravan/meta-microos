SUMMARY = "General grommunio system user identities"
DESCRIPTION = "This package provides identities related to the Grommunio groupware suite: \
* the 'grommunio' user identity for running the Administration API \
  (usually an uwsgi process instance); AAPI needs to read \
  mysql_adaptor.cfg and ldap_adaptor.cfg, so is added to group \
  gromoxcf \
* the 'groweb' user identity for running PHP-FPM workers \
* the 'groweb' group identity for marking data to be consumed by the \
  groweb identity but also created by grommunio-index, e.g. groweb \
  search indexes \
* the 'groindex' user identity for running the indexer service; this \
  needs to read mysql_adaptor.cfg so is added to group gromoxcf"
LICENSE = "MIT"

PV = "10"

RPM_NAME = "system-user-grommunio-10-1.7.noarch.rpm"
RPM_HASH = "bf2011c133f5d51596e50a88899543f246e4d32adabdbad6d6c30c332ae3225fc4e1c1dd7d9ac5df31b2291d7672b87b8129051fdb0b5252c66005f5ddaaaad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-groindex \
group-grommunio \
group-gromoxcf \
group-groweb \
system-user-grommunio \
system-user-groweb \
user-groindex \
user-grommunio \
user-groweb"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
