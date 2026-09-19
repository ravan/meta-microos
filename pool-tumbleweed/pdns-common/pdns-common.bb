SUMMARY = "Shared directories between PowerDNS Packages"
DESCRIPTION = "Shared directories between PowerDNS Packages"
LICENSE = "MIT"

PV = "4.0"

RPM_NAME = "pdns-common-4.0-4.5.noarch.rpm"
RPM_HASH = "685462f0c700f1f982fdbb50e47007be0cc5cecfde432f2b236079290eef42fb957f38b5de306acc2e82925b32bb461f94b9bb7f9a57950380a521e1ce578e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-pdns \
pdns-common \
user-pdns"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow \
sysuser-shadow"

inherit rpm
