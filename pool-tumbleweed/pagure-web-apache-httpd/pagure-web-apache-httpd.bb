SUMMARY = "Apache HTTPD configuration for Pagure"
DESCRIPTION = "This package provides the configuration files for deploying \
a Pagure server using the Apache HTTPD server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-web-apache-httpd-5.14.1-3.3.noarch.rpm"
RPM_HASH = "ab53a8d5cf8d135a88cf6a818a30db996e9c05b5bb0956724909b28052c1411845c0e733d6785827126591f0597f0c364031fdb96022affe7d770b68cbffee00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pagure-web-apache-httpd \
pagure-web-apache-httpd"

RDEPENDS:${PN} += "/usr/bin/sh \
apache2-mod-wsgi-python3 \
pagure"

inherit rpm
