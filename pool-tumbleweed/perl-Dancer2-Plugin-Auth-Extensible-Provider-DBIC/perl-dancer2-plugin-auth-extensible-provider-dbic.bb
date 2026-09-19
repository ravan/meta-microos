SUMMARY = "Authenticate via the Dancer2::Plugin::DBIC plugin"
DESCRIPTION = "This class is an authentication provider designed to authenticate users \
against a database, using Dancer2::Plugin::DBIC to access a database. \
 \
See Dancer2::Plugin::DBIC for how to configure a database connection \
appropriately; see the CONFIGURATION section below for how to configure \
this authentication provider with database details. \
 \
See Dancer2::Plugin::Auth::Extensible for details on how to use the \
authentication framework."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.624"

RPM_NAME = "perl-Dancer2-Plugin-Auth-Extensible-Provider-DBIC-0.624-1.27.noarch.rpm"
RPM_HASH = "769ee07f6d3aca50d458f19636b1fc542066e1d519be41807a11e5c796b563f7fea1c119f9af6208e0a8d0e26efa7d263c5d0ddef2f67e72e39beea6926328c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--Auth--Extensible--Provider--DBIC \
perl-Dancer2-Plugin-Auth-Extensible-Provider-DBIC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBIx--Class--ResultClass--HashRefInflator \
perl-Dancer2 \
perl-Dancer2--Core--Types \
perl-Dancer2--Plugin--Auth--Extensible \
perl-Dancer2--Plugin--DBIC \
perl-DateTime \
perl-Moo \
perl-String--CamelCase \
perl-namespace--clean"

inherit rpm
