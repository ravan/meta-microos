SUMMARY = "Check the age/size of files"
DESCRIPTION = "This plugin will check either the age of files or their size."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-file_age-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "34cd6d4037e098225868c69c5deaf7620831b1dcffda7606d639905de79fcea91fc776a687ccca450e8a345d26fcd1c9701285a66ea74b263019831248b8b8f1"

RPROVIDES:${PN} += "monitoring-plugins-file-age \
nagios-plugins-file-age"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl"

inherit rpm
