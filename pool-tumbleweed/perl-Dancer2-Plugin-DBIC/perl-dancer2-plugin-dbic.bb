SUMMARY = "DBIx::Class interface for Dancer2 applications"
DESCRIPTION = "This plugin makes it very easy to create Dancer2 applications that \
interface with databases. It automatically exports the keyword 'schema' \
which returns a DBIx::Class::Schema object. It also exports the keywords \
'resultset' and 'rset'. You just need to configure your database connection \
information. For performance, schema objects are cached in memory and are \
lazy loaded the first time they are accessed. \
 \
This plugin is a thin wrapper around DBICx::Sugar."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0100"

RPM_NAME = "perl-Dancer2-Plugin-DBIC-0.0100-1.27.noarch.rpm"
RPM_HASH = "ed38eef19b982402781e87d8b458e81a5a1975d3c2462f1de7ef0b0f718d3a5d47d9ef1b44e89c800b990843290476c30addef1e159357bcf093a8c722e1d536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--DBIC \
perl-Dancer2-Plugin-DBIC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBICx--Sugar \
perl-Dancer2 \
perl-Dancer2--Plugin"

inherit rpm
