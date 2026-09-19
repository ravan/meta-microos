SUMMARY = "Munin scripts"
DESCRIPTION = "Use this package to install munin scripts that allow to monitor some openQA \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-munin-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "6240e3acf1778d0843e2461512b23fcdaf81441e352bb9ea9e20dd0ce41ca1d31b32d1306b36f6cb936edb95136175234d542bcefa9b557206164390aa8a843c"

RPROVIDES:${PN} += "config-openQA-munin \
openQA-munin"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
munin \
munin-node \
perl"

inherit rpm
