SUMMARY = "Test a SIP server/device for availability and response time"
DESCRIPTION = "Test SIP servers. \
 \
check_sip requires the following variable: \
  -u  Full SIP uri, eg sip:uri@example.com \
 \
The following optional variables are also available: \
  -f From SIP uri \
  -H Host to connect to \
  -p Port to connect to \
  -w Seconds after which to respond with a warning \
  -s Switch off standard behavior: after this, all SIP-responses are counted \
      as success"
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "monitoring-plugins-sip-1.3-101.7.noarch.rpm"
RPM_HASH = "b291d0c1b53f2306f13628391300d76666923a569c8568382a1ad41ce4372c5ae2cad6227cb96ca9ee910549c2b585a31e005dd66404626fea29922c13ada38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-sip \
nagios-plugins-sip"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-IO--Socket--INET \
perl-Net--Domain \
perl-Switch \
perl-Time--HiRes"

inherit rpm
