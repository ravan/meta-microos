SUMMARY = "Credential Management for DBIx::Class"
DESCRIPTION = "DBIx::Class::Schema::Config is a subclass of DBIx::Class::Schema that \
allows the loading of credentials & configuration from a file. The actual \
code itself would only need to know about the name used in the \
configuration file. This aims to make it simpler for operations teams to \
manage database credentials. \
 \
A simple tutorial that compliments this documentation and explains \
converting an existing DBIx::Class Schema to use this software to manage \
credentials can be found at \
http://www.symkat.com/credential-management-in-dbix-class"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001014"

RPM_NAME = "perl-DBIx-Class-Schema-Config-0.001014-1.25.noarch.rpm"
RPM_HASH = "42b5f16a6f2030c5a07964c7da6ae5fa884eaa12434fed9d14b05c2fbf59a595f195b81e81d7f12dadf98cecaecce1a5226c5ac459dc8e237d91c84d5fb70892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--Schema--Config \
perl-DBIx-Class-Schema-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Config--Any \
perl-DBD--SQLite \
perl-DBIx--Class \
perl-DBIx--Class--Schema \
perl-File--HomeDir \
perl-Hash--Merge \
perl-URI \
perl-namespace--clean"

inherit rpm
