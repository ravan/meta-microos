SUMMARY = "Supportconfig Analysis Patterns for HAE"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of High Availability Extension (HAE) \
clustering \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.3"

RPM_NAME = "sca-patterns-hae-1.5.3-1.9.noarch.rpm"
RPM_HASH = "08bdfa0bf66e33265e8276f5ca0d4eecd7d11f568b701a6974a72c5bacb5d093ba6f05ca30f97c44016bfdcb9bc35ab52c28f7b911e1de6d7ccb3302cfbc8898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-hae"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
sca-patterns-base \
sca-server-report"

inherit rpm
