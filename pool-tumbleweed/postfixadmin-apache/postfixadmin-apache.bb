SUMMARY = "Postfixadmin - Apache configuration"
DESCRIPTION = "PostfixAdmin is a PHP based application that handles Postfix Style Virtual \
Domains and Users that are stored in MySQL or PostgreSQL. \
 \
This package holds the apache configuration."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.15"

RPM_NAME = "postfixadmin-apache-3.3.15-1.7.noarch.rpm"
RPM_HASH = "ce537aeb99f0a3ec26cde15f3ee254d5bee909d82bc1df725d545b4b724a242ccdf77201114147e4b266937fc244c49bc21917dcd1aabc2df7ba775d1d69221a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postfixadmin-apache \
postfixadmin-apache"

RDEPENDS:${PN} += "apache2"

inherit rpm
