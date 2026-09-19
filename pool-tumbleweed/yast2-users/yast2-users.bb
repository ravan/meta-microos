SUMMARY = "YaST2 - User and Group Configuration"
DESCRIPTION = "This package provides GUI for maintenance of linux users and groups."
LICENSE = "GPL-2.0-only"

PV = "5.0.8"

RPM_NAME = "yast2-users-5.0.8-1.2.aarch64.rpm"
RPM_HASH = "4e51c0a1ff0032427a0c29af831ddadeec716a59bbed1458d1d4e56699bba315fd22b892afece432a97105a6230992d1d138fa2a770607c4c87f99d2bbe1059a"

RPROVIDES:${PN} += "libpy2ag-crack.so.2 \
perl-Users \
perl-UsersCache \
perl-UsersLDAP \
perl-UsersPasswd \
perl-UsersPluginKerberos \
perl-UsersPluginLDAPAll \
perl-UsersPluginLDAPPasswordPolicy \
perl-UsersPluginLDAPShadowAccount \
perl-UsersPluginQuota \
perl-UsersPlugins \
perl-UsersRoutines \
perl-UsersSimple \
perl-YaPI--ADMINISTRATOR \
perl-YaPI--USERS \
yast2-users"

RDEPENDS:${PN} += "/usr/bin/perl \
cracklib \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
libgcc-s.so.1 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
perl-Digest-SHA1 \
perl-X500-DN \
perl-gettext \
yast2 \
yast2-core \
yast2-country \
yast2-ldap \
yast2-pam \
yast2-perl-bindings \
yast2-ruby-bindings \
yast2-security"

inherit rpm
