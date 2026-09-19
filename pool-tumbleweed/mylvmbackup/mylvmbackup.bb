SUMMARY = "Utility for creating MySQL backups via LVM snapshots"
DESCRIPTION = "mylvmbackup is a script for quickly creating backups of MySQL server's data \
files. To perform a backup, mylvmbackup obtains a read lock on all tables and \
flushes all server caches to disk, makes an LVM snapshot of the volume \
containing the MySQL data directory, and unlocks the tables again. The snapshot \
process takes only a small amount of time. When it is done, the server can \
continue normal operations, while the actual file backup proceeds."
LICENSE = "GPL-2.0+"

PV = "0.16"

RPM_NAME = "mylvmbackup-0.16-2.24.noarch.rpm"
RPM_HASH = "c51e5cec76b9b00f3ce73a579479accc8ca8cca3e9a8731e1a0fe40068a5a9c0093af818a4c4af63443281754f4a242c595e53f7ddf9e91b79d4c5ab57bd28a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mylvmbackup \
mylvmbackup \
perl-backupfailure \
perl-logerr \
perl-preflush"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Config--IniFiles \
perl-DBD--mysql \
perl-DBI \
perl-Date--Format \
perl-Fcntl \
perl-File--Basename \
perl-File--Copy \
perl-File--Copy--Recursive \
perl-File--Path \
perl-File--Temp \
perl-Getopt--Long \
perl-Sys--Hostname"

inherit rpm
