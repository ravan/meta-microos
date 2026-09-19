SUMMARY = "Convenience package for a single-instance setup using apache proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-single-instance-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "de10529ad3f6c6dbe641f664bbeaffc77450253cabdc8c2f09aad7ba4af709e465201ff143fcb503868bfdff50568deeb040cc76e3087d9181668342578dfde2"

RPROVIDES:${PN} += "openQA-single-instance \
openQA-single-instance-apache \
openQA-single-instance-apache2"

RDEPENDS:${PN} += "apache2 \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
