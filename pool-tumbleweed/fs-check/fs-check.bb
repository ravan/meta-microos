SUMMARY = "Check File System Usage"
DESCRIPTION = "fs-check checks file system sizes to see if they are getting too full. \
It uses a configuration file that specifies the file systems to check, \
e-mail contacts, trigger thresholds (percentage or amount used and \
unused), and a report program to run. It includes fs-report, which \
shows things like the largest files, the newest files, and core files. \
It can be run from cron or as a daemon."
LICENSE = "GPL-2.0-or-later"

PV = "0.9"

RPM_NAME = "fs-check-0.9-56.7.noarch.rpm"
RPM_HASH = "4ce035d832a7ddd0c338ec479d2162422cddf6fac178eefe9f794afc2c5e9157d8c1d798970d53139059ef20193365ee260a733890f398a7c5a37a19ed05fb33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fs-check \
fs-check"

RDEPENDS:${PN} += "/usr/bin/perl \
mailx"

inherit rpm
