SUMMARY = "All Monitoring-Plugin checks"
DESCRIPTION = "This virtual package recommends all currently available, official \
Monitoring plugins and additional packages that are available in \
https://build.opensuse.org/project/show/server:monitoring"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-all-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "b35bf338368f67a42a5e6e0ebdae27c94665a551bfcf296b3b669420fd1072ef2011ceb428b42d23019615df65bf3009a847717af47c804b3cc4fe3c72c46557"

RPROVIDES:${PN} += "monitoring-plugins-all \
nagios-plugins-all"

RDEPENDS:${PN} += ""

inherit rpm
