SUMMARY = "Command line shell and scripting interface for Drupal"
DESCRIPTION = "Drush is a command line shell and scripting interface for Drupal, a veritable \
Swiss Army knife designed to make life easier for those of us who spend some of \
our working hours hacking away at the command prompt."
LICENSE = "GPL-2.0-or-later"

PV = "8.3.2"

RPM_NAME = "drush-8.3.2-1.18.noarch.rpm"
RPM_HASH = "ad44d96fc234445ea7e32bc0216f8bd88b87703a514ea18a948facad4040fe8b520d9b75b0b10478d1d79becf42fde712d094d55dc8bdbdadf287a19549102f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drush \
drush-make"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
php \
php-ctype \
php-iconv \
php-json \
which"

inherit rpm
