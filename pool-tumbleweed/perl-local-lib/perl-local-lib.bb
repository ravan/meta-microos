SUMMARY = "Create and use a local lib/ for perl modules with PERL5LIB"
DESCRIPTION = "This module provides a quick, convenient way of bootstrapping a user-local \
Perl module library located within the user's home directory. It also \
constructs and prints out for the user the list of environment variables \
using the syntax appropriate for the user's current shell (as specified by \
the 'SHELL' environment variable), suitable for directly adding to one's \
shell configuration file. \
 \
More generally, local::lib allows for the bootstrapping and usage of a \
directory containing Perl modules outside of Perl's '@INC'. This makes it \
easier to ship an application with an app-specific copy of a Perl module, \
or collection of modules. Useful in cases like when an upstream maintainer \
hasn't applied a patch to a module of theirs that you need for your \
application. \
 \
On import, local::lib sets the following environment variables to \
appropriate values: \
 \
* PERL_MB_OPT \
 \
* PERL_MM_OPT \
 \
* PERL5LIB \
 \
* PATH \
 \
* PERL_LOCAL_LIB_ROOT \
 \
When possible, these will be appended to instead of overwritten entirely. \
 \
These values are then available for reference by any code after import."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000029"

RPM_NAME = "perl-local-lib-2.000029-1.15.noarch.rpm"
RPM_HASH = "bdd7fe9df92adbb6e2ef23f8ea30b3fbe177c484282a64e889d4944a02f1fede60f8bfbbb9f2d1be9cd9c8996b264b853f183f4ca8d7c8db647700bae7d407a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-lib--core--only \
perl-local--lib \
perl-local-lib"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN \
perl-ExtUtils--Install \
perl-ExtUtils--MakeMaker \
perl-Module--Build"

inherit rpm
