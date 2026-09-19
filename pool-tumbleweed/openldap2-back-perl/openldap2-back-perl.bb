SUMMARY = "OpenLDAP Perl backend"
DESCRIPTION = "The OpenLDAP Perl back-end allows you to execute Perl code specific to \
different LDAP operations."
LICENSE = "OLDAP-2.8"

PV = "2.6.13"

RPM_NAME = "openldap2-back-perl-2.6.13-1.6.aarch64.rpm"
RPM_HASH = "811880f24279503ab52c4d7b2ac8494a71dea903439ad93e506933936f6bec34df10e61861e6c8a8f63bc395b1abc4b38fcd235a6b5b257ba9002708b62d0e5a"

RPROVIDES:${PN} += "openldap2-back-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libperl.so \
openldap2 \
perl"

inherit rpm
