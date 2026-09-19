SUMMARY = "Apparmor profile for lutris"
DESCRIPTION = "Apparmor profile for lutris."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.22"

RPM_NAME = "lutris-apparmor-0.5.22-2.2.aarch64.rpm"
RPM_HASH = "167ee174bcfa5fc809de1b564cd419c69b5d99dd46b8b246adf29d18449cdaed61420a98ca1ea1b57520ab48e704f1aedfa802d41751f78316940aecbf3c741a"

RPROVIDES:${PN} += "lutris-apparmor"

RDEPENDS:${PN} += "lutris"

inherit rpm
