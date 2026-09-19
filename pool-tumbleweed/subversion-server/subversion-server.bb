SUMMARY = "Apache server module for Subversion server"
DESCRIPTION = "The subversion-server package adds the Subversion server Apache module \
to the Apache directories and configuration."
LICENSE = "Apache-2.0"

PV = "1.14.5"

RPM_NAME = "subversion-server-1.14.5-5.3.aarch64.rpm"
RPM_HASH = "702e472d00b2c196e722abaadf7e9285b3fd820291e8b580bdbb87b77bfbc1a64ae1d786e2dfeaea2170d04b8ec556746a03de70403194edace4b7bd35aedd36"

RPROVIDES:${PN} += "config-subversion-server \
subversion-server"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libsvn-delta-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
subversion"

inherit rpm
