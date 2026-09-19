SUMMARY = "Shell tool for executing jobs in parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. A job can be a single command or a small script \
that has to be run for each of the lines in the input. The typical \
input is a list of files, a list of hosts, a list of users, a list of \
URLs, or a list of tables. A job can also be a command that reads from \
a pipe. GNU Parallel can then split the input and pipe it into \
commands in parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20260822"

RPM_NAME = "gnu_parallel-20260822-1.1.noarch.rpm"
RPM_HASH = "1bac10a6072289f5dc08973fa045c31aeccfaf1947a1a53b20d496b906fc7d5ef4d5020e28f403d8629da0816420a8cdb0d5de404ea6f90ac42971bc3cbde535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel \
gnu-parallel-bash-completion \
gnu-parallel-zsh-completion"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl"

inherit rpm
