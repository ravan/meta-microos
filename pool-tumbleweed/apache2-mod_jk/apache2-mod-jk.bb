SUMMARY = "Connectors between Apache and Tomcat Servlet Container"
DESCRIPTION = "This package provides modules for Apache to invisibly integrate Tomcat \
capabilities into an existing Apache installation. \
 \
To load the module into Apache, run the command 'a2enmod jk' as root."
LICENSE = "Apache-2.0"

PV = "1.2.50"

RPM_NAME = "apache2-mod_jk-1.2.50-3.6.aarch64.rpm"
RPM_HASH = "b393f0bc3039777b2f77a93f0373ed4502cb608ea41f669650461d5b327cac4342f849ee0b21d36c698362c571fa9cea367de63119864d127373181abc05a19a"

RPROVIDES:${PN} += "apache2-mod-jk \
mod-jk \
mod-jk-ap20 \
tomcat-mod"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
suse-maintenance-mmn-0"

inherit rpm
