SUMMARY = "Spamassassin Monitoring for collectd"
DESCRIPTION = "Plugin for filling collectd with statistics from the \
SpamAsssassin anti-spam engine."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-spamassassin-5.12.0.382.g2cd055fe-3.1.noarch.rpm"
RPM_HASH = "f5b394bc158e8d8b8141de56e12838dc3362b26b23d6f42fcfa76cd0d393ed533a8d98c517f897b1af3b97938eccbeb0cd9fad679749271eea15715cc572caa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectd-spamassassin \
config-collectd-spamassassin \
perl-Mail--SpamAssassin--Plugin--Collectd"

RDEPENDS:${PN} += "collectd \
perl-spamassassin"

inherit rpm
