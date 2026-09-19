SUMMARY = "A MySQL and InnoDB monitor program"
DESCRIPTION = "Innotop is a powerful 'top' clone for MySQL. It connects to a MySQL database server \
and retrieves information from it, then displays it in a manner similar to the UNIX \
top program. Innotop uses the data from SHOW VARIABLES, SHOW GLOBAL STATUS, SHOW FULL \
PROCESSLIST, and SHOW ENGINE INNODB STATUS, among other things."
LICENSE = "GPL-2.0-only"

PV = "1.15.2"

RPM_NAME = "innotop-1.15.2-1.6.noarch.rpm"
RPM_HASH = "e4cb94cd5e588ecf80fe713fecd294ed62ec0e36460a2821adccfbdee93efc9353371c0aabc5e095b24ab138dd1e663f2bb2353ccff096bf9a32341d0a12c23b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "innotop"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-DBD--mysql \
perl-DBI \
perl-File--Basename \
perl-File--Temp \
perl-Getopt--Long \
perl-List--Util \
perl-Term--ReadKey \
perl-Time--HiRes"

inherit rpm
