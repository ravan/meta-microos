SUMMARY = "Framework to facilitate creation of command line applications"
DESCRIPTION = "App::Rad is a framework for developing \
command-line applications. It can transform Perl _one-liners_ \
into subroutines than can be called by the user of your \
program. \
 \
It also provides an interface for common command-line \
tasks."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.50.0"

RPM_NAME = "perl-App-Rad-1.50.0-1.7.noarch.rpm"
RPM_HASH = "1e4a786ebd7c092e550d564d2cbb0658c753fc63c0f31d9a6d9c3edae02cbd80fee33573a4513beb734414c3fb458a14caa144fddc32883a4753bec43d050820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Rad \
perl-App--Rad--Config \
perl-App--Rad--Exclude \
perl-App--Rad--Help \
perl-App--Rad--Include \
perl-App-Rad"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Getopt--Long"

inherit rpm
