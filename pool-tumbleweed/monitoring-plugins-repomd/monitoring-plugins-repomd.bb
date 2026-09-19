SUMMARY = "Plugin to check freshness of repomd.xml file"
DESCRIPTION = "This plugin checks the up-to date state of repomd.xml. \
 \
Important options: \
 -u <url_to_repomd.xml> : please enter the full URL to the repomd.xml file \
 -o <days>              : days unless a repomd.xml file is handled as outdated (default: 30)"
LICENSE = "BSD-3-Clause"

PV = "2.1"

RPM_NAME = "monitoring-plugins-repomd-2.1-2.14.noarch.rpm"
RPM_HASH = "5efe010fe3ca04bbd460a73f348a16e2c502170eee8c227d989f2acddf02291947812196ebd695069631ca8388f3a009a2d02a206506bcad2b4012acc653a07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-repomd \
monitoring-plugins-repomd \
nagios-plugins-repomd"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
curl \
grep \
monitoring-plugins-common"

inherit rpm
