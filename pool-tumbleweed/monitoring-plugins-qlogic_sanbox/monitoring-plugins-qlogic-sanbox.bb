SUMMARY = "Check QLogic FC Sanboxes"
DESCRIPTION = "Nagios plugin, allowing to check QLogic FC Sanboxes. \
 \
This plugin has been tested with the following QLogic switches: \
 \
SANbox 5200 FC Switch \
SANbox 5202 FC Switch \
SANbox 5600 FC Switch \
SANbox 5602 FC Switch \
SANbox 5800 FC Switch"
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "monitoring-plugins-qlogic_sanbox-1.4-1.13.noarch.rpm"
RPM_HASH = "1e0abd1cdb38c18ab5078f1e3ea2456ee31f3181bab9a5ada63d2eb88b5ef6163db4566fb156c6ed371c094fc5dfeabdd71d04f833c2a1b98b479cd697a2eb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-qlogic-sanbox \
nagios-plugins-qlogic-sanbox"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Getopt--Long \
perl-Net--Ping \
perl-Net--SNMP \
perl-Pod--Usage"

inherit rpm
