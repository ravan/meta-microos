SUMMARY = "Check age of files in a directory"
DESCRIPTION = "This plugin checks one or more directory for files older than a specified age. \
You can define the age of files for warning and critical states. \
 \
Note: the plugin checks the mtime of files, not the ctime. \
 \
Usage: check_dircontent.pl -w 24 -c 48 -p /tmp,/var/tmp -i foo,bar \
Options: \
       -w|--warning   : time for warnings (minutes) \
       -c|--critical  : time for critical warnings (minutes) \
       -p|--pathnames : absolute path to the folders, split mutliple pathnames with commata \
       -t|--timeout   : timeout (default: 15) \
	   -i|--ignore    : ignore filenames (comma separated) \
	   -d|--debug     : print debug output"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "monitoring-plugins-contentage-0.7-1.17.noarch.rpm"
RPM_HASH = "37a3d06b861d5c15a063ac983c8bdd1946106b3b28f9fae34b6fee1cf376706dfb6d58d829f11399565b158bf044eccf30199bae8c8074da7d048a3e48c036d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-contentage \
nagios-plugins-contentage"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-File--Basename \
perl-File--stat \
perl-Getopt--Long \
perl-POSIX \
perl-Time--HiRes"

inherit rpm
