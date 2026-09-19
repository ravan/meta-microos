SUMMARY = "Kernel.org Uploader - server"
DESCRIPTION = "Kup is a file upload utility for kernel.org. It is designed to only accept \
cryptographically verified uploads from pre-authorized, trusted members."
LICENSE = "GPL-2.0+"

PV = "0.3.6"

RPM_NAME = "kup-server-0.3.6-1.22.aarch64.rpm"
RPM_HASH = "160142fe3fd4112c77d9b711f18db6c3a5d7b2970efcbcb1428d7afbb3b5883f6f896bd66c289d6637f5b6bbc16f03785e73496079b923b1052272b62158737d"

RPROVIDES:${PN} += "kup-server"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl \
perl-BSD--Resource \
perl-Config--Simple \
perl-Digest--SHA \
perl-Encode \
perl-Fcntl \
perl-File--Path \
perl-File--Temp \
perl-Git \
perl-IO--Handle \
perl-IPC--Open2 \
perl-POSIX \
perl-Sys--Syslog"

inherit rpm
