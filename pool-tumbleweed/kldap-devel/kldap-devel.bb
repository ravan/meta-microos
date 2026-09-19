SUMMARY = "Development files for kldap"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to add LDAP support to applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kldap-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "7be50436359488440204aa2bbce167c634bbebe2838ddede18d6f19685a9d90253be05355cc30fb6fadbd23e2e046ad4feae939796e8c950201484a57eedb7af"

RPROVIDES:${PN} += "cmake-KPim6LdapCore \
cmake-KPim6LdapWidgets \
kldap-devel"

RDEPENDS:${PN} += "libKPim6LdapCore6 \
libKPim6LdapWidgets6"

inherit rpm
