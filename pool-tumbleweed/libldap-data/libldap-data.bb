SUMMARY = "Configuration file for system-wide defaults for all uses of libldap"
DESCRIPTION = "The subpackage contains a configuration file used to set system-wide defaults \
to be applied with all usages of libldap."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "libldap-data-2.6.13-1.6.noarch.rpm"
RPM_HASH = "8742c4dfec47dc7e3e6f97e0fb9c1dc40e269750d196008a7569dfc5761c1e745b344bf26857678180a23b6d18df8394f40fd7e42a19c051659f1c5ce2f05658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libldap-data \
libldap-data"

RDEPENDS:${PN} += ""

inherit rpm
