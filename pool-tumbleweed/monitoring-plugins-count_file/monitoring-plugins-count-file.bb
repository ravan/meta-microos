SUMMARY = "Counts the number of files in a directory"
DESCRIPTION = "Use this plugin to count the number of files in a directory and \
issue a warning or critical state if the number exceeds a limit. \
 \
Useful if you want to monitor for example: \
* a directory which contains error files and must stay empty \
* a tmp dir which have to stay under a practical limit"
LICENSE = "BSD-4-Clause"

PV = "232"

RPM_NAME = "monitoring-plugins-count_file-232-1.23.noarch.rpm"
RPM_HASH = "f22bed113e38295942f26249b6a26c6e4446024b1c1ad4c5b4278b9d2c435ffd5539f47a3d62fe2c579e850701e11e8c891959fbfe9de90eb823db5898856803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-count-file \
nagios-plugins-count-file"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
