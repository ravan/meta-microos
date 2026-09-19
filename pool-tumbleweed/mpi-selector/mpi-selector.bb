SUMMARY = "Tool to provide defaults for which MPI implementation to use"
DESCRIPTION = "A simple tool that allows system administrators to set a site-wide \
default for which MPI implementation is to be used, but also allow \
users to set their own defaults MPI implementation, thereby overriding \
the site-wide default. \
 \
The default can be changed easily via the mpi-selector command -- \
editing of shell startup files is not required."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "mpi-selector-1.0.3-15.14.noarch.rpm"
RPM_HASH = "a30a8d84430ce789acfb3df00cc510d67a95a9d88df05a4eea5950367d97d03344856fd5cc28da8fba0d1fc4743651eddf2884b669d8521f856ae578ca61605d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mpi-selector \
mpi-selector"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
