SUMMARY = "Logrotate for Keylime servies"
DESCRIPTION = "Subpackage of keylime for logrotate for Keylime services"
LICENSE = "Apache-2.0 & MIT & BSD-3-Clause"

PV = "7.14.3"

RPM_NAME = "keylime-logrotate-7.14.3-1.1.noarch.rpm"
RPM_HASH = "da49a9e16868949da9e88274b667022f161965ae2c1f19bbf77946acf1339c1298ed2a27e95ebe5d9ce8ef3e6a2554064514bdd027080b65f49c40a32cf07bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keylime-logrotate"

RDEPENDS:${PN} += "logrotate"

inherit rpm
