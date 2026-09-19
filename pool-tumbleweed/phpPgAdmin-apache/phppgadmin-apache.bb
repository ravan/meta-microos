SUMMARY = "Apache configuration for phpPgAdmin"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-2.0-or-later"

PV = "7.14.7"

RPM_NAME = "phpPgAdmin-apache-7.14.7-1.3.noarch.rpm"
RPM_HASH = "c2e6cc21d540418cb61deb1e981fec772cb1f6e26aef989bd5343be6380ff1e4a78b80f3a4826b599a0793d96e2b1587617d2c83e464dd093963c01115ab7d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phpPgAdmin-apache \
phpPgAdmin-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
apache2 \
mod-php-any \
phpPgAdmin"

inherit rpm
