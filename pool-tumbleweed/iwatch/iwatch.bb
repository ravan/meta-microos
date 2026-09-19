SUMMARY = "Realtime filesystem monitoring program"
DESCRIPTION = "iWatch monitor the filesystem's integrity in realtime and will send \
alarm immediately to the system administrator when there is any changes \
in the monitored filesystem. iWatch is written in Perl and based on \
inotify, a file change notification system, a kernel feature that \
allows applications to request the monitoring of a set of files against \
a list of events. \
 \
Currently it can: \
 \
- run in command line mode as well as in daemon mode \
 \
- using an easy xml configuration file \
 \
- can watch directory recursively and watch new created directory \
 \
- can have a list of exceptions \
 \
- can use regex to compare the file/directory name \
 \
- can execute command if an event occures \
 \
- send email \
 \
- syslog \
 \
- print time stamp"
LICENSE = "GPL-2.0+"

PV = "0.2.2"

RPM_NAME = "iwatch-0.2.2-16.24.noarch.rpm"
RPM_HASH = "9015d6cb928f7539ece416dc66d313628f4cceab4920648b1380a9814429970883f6d07d6718a08143e2cece7d82ebe1c98ea8754ae3041342fc62f92885ef04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-iwatch \
iwatch"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Event \
perl-Linux-Inotify2 \
perl-Mail-Sendmail \
perl-XML-LibXML \
perl-XML-SimpleObject-LibXML"

inherit rpm
