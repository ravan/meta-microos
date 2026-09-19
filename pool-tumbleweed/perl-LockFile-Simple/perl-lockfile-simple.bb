SUMMARY = "Simple file locking scheme"
DESCRIPTION = "This simple locking scheme is not based on any file locking system calls \
such as 'flock()' or 'lockf()' but rather relies on basic file system \
primitives and properties, such as the atomicity of the 'write()' system \
call. It is not meant to be exempt from all race conditions, especially \
over NFS. The algorithm used is described below in the *ALGORITHM* section. \
 \
It is possible to customize the locking operations to attempt locking once \
every 5 seconds for 30 times, or delete stale locks (files that are deemed \
too ancient) before attempting the locking."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.208"

RPM_NAME = "perl-LockFile-Simple-0.208-5.46.aarch64.rpm"
RPM_HASH = "878aee50835fb2541379959a482ea57ef75dce32b63d37790608dc7bf079a1122012796d5fbab1468c37b3e315f35c9029e353e60e633e979be1304fa5220472"

RPROVIDES:${PN} += "perl-LockFile--Lock \
perl-LockFile--Lock--Simple \
perl-LockFile--Manager \
perl-LockFile--Simple \
perl-LockFile-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
