SUMMARY = "Experimental features made easy"
DESCRIPTION = "This pragma provides an easy and convenient way to enable or disable \
experimental features. \
 \
Every version of perl has some number of features present but considered \
'experimental.' For much of the life of Perl 5, this was only a designation \
found in the documentation. Starting in Perl v5.10.0, and more aggressively \
in v5.18.0, experimental features were placed behind pragmata used to \
enable the feature and disable associated warnings. \
 \
The 'experimental' pragma exists to combine the required incantations into \
a single interface stable across releases of perl. For every experimental \
feature, this should enable the feature and silence warnings for the \
enclosing lexical scope: \
 \
  use experimental 'feature-name';"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.036"

RPM_NAME = "perl-experimental-0.036-1.6.noarch.rpm"
RPM_HASH = "c2e4765b6619ff7e3088ef4f904f1f70f050bd8581657f1c367a549453858997bdc27ac2bbac53eeb36c485062534e1de4a6083fff7d0e84fc72b8b9d236c2ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-experimental \
perl-stable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-version"

inherit rpm
