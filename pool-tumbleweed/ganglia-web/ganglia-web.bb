SUMMARY = "Ganglia web frontend"
DESCRIPTION = "This package provides a web frontend to display the XML tree published by \
ganglia, and to provide historical graphs of collected metrics. This website is \
written in the PHP5/7 language and uses the Dwoo templating engine."
LICENSE = "BSD-3-Clause"

PV = "3.7.5"

RPM_NAME = "ganglia-web-3.7.5-3.7.noarch.rpm"
RPM_HASH = "b79bf6e4ed61b31548d82bdb40d7c56830de3ce962abcd8350430923043c53971abc1bf076068bb748241a6cf3ef4fb79b57a5bd218c851b51d074a8c5cbb079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ganglia-web \
ganglia-web"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
apache2 \
group-www \
mod-php-any \
php \
php-gd \
php-xml \
rrdtool \
user-wwwrun"

inherit rpm
