SUMMARY = "Per-user Perl local::lib setup"
DESCRIPTION = "perl-homedir configures the system to automatically create a ~/perl5 \
directory in each user's $HOME on user login.  This allows each user to \
install and CPAN packages via the CPAN to their $HOME, with no additional \
configuration or privliges, and without installing them system-wide. \
 \
If you want your users to be able to install and use their own Perl modules, \
install this package."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000029"

RPM_NAME = "perl-homedir-2.000029-1.15.noarch.rpm"
RPM_HASH = "8297f8838da823235a34d17c8a41fa626f122e5e6dbc089c89b5fc55e7f51ec955e28bbccefba69294b94b5e67504f1a4a6ae8ee5f18c4b2850f01f1dc69c387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-homedir \
perl-homedir"

RDEPENDS:${PN} += "/usr/bin/cpan \
perl-local-lib"

inherit rpm
