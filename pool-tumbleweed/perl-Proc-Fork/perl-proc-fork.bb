SUMMARY = "Simple, intuitive interface to the fork() system call"
DESCRIPTION = "This module provides an intuitive, Perl-ish way to write forking programs \
by letting you use blocks to illustrate which code section executes in \
which fork. The code for the parent, child, retry handler and error handler \
are grouped together in a 'fork block'. The clauses may appear in any \
order, but they must be consecutive (without any other statements in \
between). \
 \
All four clauses need not be specified. If the retry clause is omitted, \
only one fork will be attempted. If the error clause is omitted the program \
will die with a simple message if it can't retry. If the parent or child \
clause is omitted, the respective (parent or child) process will start \
execution after the final clause. So if one or the other only has to do \
some simple action, you need only specify that one. For example: \
 \
  \
 run_fork { child { \
     exec '/bin/ls', '-l'; \
     die 'Couldn't exec ls: $!\\n'; \
 } }; \
  \
  \
 \
If the code in any of the clauses does not die or exit, it will continue \
execution after the fork block."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.808"

RPM_NAME = "perl-Proc-Fork-0.808-1.18.noarch.rpm"
RPM_HASH = "418700e9ed0c2311cf98ad8d7a89a8599efc2c0723f685ce430912be4e1d406ef055a8907ae806de3d691fd3d531f9860c55b57a50e8a906bb1477a416b80945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Proc--Fork \
perl-Proc-Fork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exporter--Tidy"

inherit rpm
