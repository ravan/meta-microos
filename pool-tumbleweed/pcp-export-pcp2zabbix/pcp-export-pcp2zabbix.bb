SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Zabbix"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to the Zabbix (https://www.zabbix.org/) monitoring software."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-export-pcp2zabbix-6.3.8-3.1.noarch.rpm"
RPM_HASH = "a256d714f34aac2564ecd4a793161a97fb5446a60b527938c9634544ccfba4aedb05d0cd83f3020e999d62d893339d6c2e00535d844efb2932aacfb96fff4aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-export-pcp2zabbix"

RDEPENDS:${PN} += "/usr/bin/pmpython \
python3-pcp"

inherit rpm
