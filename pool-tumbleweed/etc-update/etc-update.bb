SUMMARY = "Configuration file update handler"
DESCRIPTION = "etc-update  is  supposed  to be run after merging a new package to see if there \
are updates to the configuration files.  If a new configuration file will \
override an old one, etc-update will prompt the user for a decision. \
 \
etc-update will check all directories specified on the command line.  If no \
paths are given, then the CONFIG_PROTECT variable will be  used.   All  config \
files  found  in  CONFIG_PRO‐TECT_MASK will automatically be updated for you by \
etc-update."
LICENSE = "GPL-2.0-only"

PV = "2.3.31"

RPM_NAME = "etc-update-2.3.31-3.7.noarch.rpm"
RPM_HASH = "95b94c3925301a83edcfc305b805223f5ba44330a7e3fd618a2bf1b1828f293a5364b29ba0856121410151877efeb39964cfea12e1848eae7be3630b30c81813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-etc-update \
etc-update"

RDEPENDS:${PN} += "/usr/bin/bash \
bash"

inherit rpm
