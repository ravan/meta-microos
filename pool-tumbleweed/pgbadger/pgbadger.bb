SUMMARY = "A fast PostgreSQL log analyzer"
DESCRIPTION = "pgBadger is a PostgreSQL log analyzer build for speed with fully detailed \
reports from your PostgreSQL log file. It's a single and small Perl script that \
aims to replace and outperform the old php script pgFouine. \
 \
By the way, we would like to thank Guillaume Smet for all the work he has done \
on this really nice tool. We've been using it a long time, it was a really \
great tool! \
 \
pgBadger is written in pure Perl language. It uses a javascript library to draw \
graphs so that you don't need additional Perl modules or any other package to \
install. Furthermore, this library gives us more features such as zooming. \
 \
pgBadger is able to autodetect your log file format (syslog, stderr or csvlog). \
It is designed to parse huge log files as well as gzip compressed file."
LICENSE = "MIT"

PV = "13.2"

RPM_NAME = "pgbadger-13.2-1.5.noarch.rpm"
RPM_HASH = "201a67932bafc4c0fec1acdae2eb5456ea7f2f5e05c23ebdc6343fbe4f756f4a0d46684a41b3e4646eb21c4da7f1b05951c864693c117ab8a95f80357ae7a4fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PgBadger \
pgbadger"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl \
perl-Benchmark \
perl-Encode \
perl-File--Basename \
perl-File--Spec \
perl-File--Temp \
perl-FileHandle \
perl-Getopt--Long \
perl-IO--File \
perl-IO--Handle \
perl-IO--Pipe \
perl-Socket \
perl-Storable \
perl-Text--Wrap \
perl-Time--Local"

inherit rpm
