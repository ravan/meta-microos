SUMMARY = "Additional Unix Utilities — Perl scripts"
DESCRIPTION = "This is a growing collection of the Unix tools that nobody thought to write long ago, when Unix was young. \
 \
This subpackage includes the following utilities: \
 \
  - combine: combine the lines in two files using boolean operations \
  - vidir: edit a directory in your text editor \
  - vipe: insert a text editor into a pipe \
  - zrun: automatically uncompress arguments to command"
LICENSE = "GPL-2.0-or-later"

PV = "0.70"

RPM_NAME = "moreutils-perl-0.70-1.9.noarch.rpm"
RPM_HASH = "e300b9e953f27bb25195a08885dcda79a22c49f21527febef047165d7ceb65ea3c22024561b90751a58b93f336865f97bd02ec5c0633c9509635bf32ff67bba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moreutils-/usr/bin/combine \
moreutils-/usr/bin/vidir \
moreutils-/usr/bin/vipe \
moreutils-/usr/bin/zrun \
moreutils-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-File--Basename \
perl-File--Path \
perl-File--Spec \
perl-File--Temp \
perl-Getopt--Long \
perl-IO--Handle \
perl-strict \
perl-warnings"

inherit rpm
