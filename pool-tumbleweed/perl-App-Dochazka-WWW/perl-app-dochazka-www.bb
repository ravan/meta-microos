SUMMARY = "Dochazka Attendance & Time Tracking system web client"
DESCRIPTION = "This is the web client of the Dochazka Attendance & Time Tracking system. \
For more information see the App::Dochazka::REST manpage and the \
App::MFILE::WWW manpage."
LICENSE = "BSD-3-Clause"

PV = "0.155"

RPM_NAME = "perl-App-Dochazka-WWW-0.155-3.12.noarch.rpm"
RPM_HASH = "c7eee4cc423c9712033f51e9aef4e0bd9d9e0a403baaf8f65ed04ca4bcdf70d95845cf78a10771f2e7a1b20b0a3f7a414ee2e2d6606d7d9ae228275e4e1ac8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-App-Dochazka-WWW \
group-dochazka-www \
perl-App--Dochazka--WWW \
perl-App--Dochazka--WWW--Dispatch \
perl-App-Dochazka-WWW \
user-dochazka-www"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
perl--MODULE-COMPAT-5.44.0 \
perl-App--CELL \
perl-App--MFILE--WWW \
perl-File--ShareDir"

inherit rpm
