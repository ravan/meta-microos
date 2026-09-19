SUMMARY = "Implicit uuid columns"
DESCRIPTION = "This the DBIx::Class manpage component resembles the behaviour of the \
Class::DBI::UUID manpage, to make some columns implicitly created as uuid. \
 \
When loaded, 'UUIDColumns' will search for a suitable uuid generation \
module from the following list of supported modules: \
 \
  Data::UUID \
  APR::UUID* \
  UUID \
  Win32::Guidgen \
  Win32API::GUID \
 \
If no supporting module can be found, an exception will be thrown. \
 \
*APR::UUID will not be loaded under OpenBSD due to an as yet unidentified \
XS issue. \
 \
If you would like to use a specific module, you can set the /uuid_class \
manpage: \
 \
  __PACKAGE__->uuid_class('::Data::UUID'); \
  __PACKAGE__->uuid_class('MyUUIDGenerator');"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02006"

RPM_NAME = "perl-DBIx-Class-UUIDColumns-0.02006-2.33.noarch.rpm"
RPM_HASH = "f416edd573749bbaf06f2638bddb23545825b6ad7e5f4c1b55bc5bde69bcf6408f7748a50ecb86c6fd3213ce2f23ddd7e88056614da592da644d703836d41ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--UUIDColumns \
perl-DBIx--Class--UUIDColumns--UUIDMaker \
perl-DBIx--Class--UUIDColumns--UUIDMaker--APR--UUID \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Data--GUID \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Data--UUID \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Data--Uniqid \
perl-DBIx--Class--UUIDColumns--UUIDMaker--UUID \
perl-DBIx--Class--UUIDColumns--UUIDMaker--UUID--Random \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Win32--Guidgen \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Win32API--GUID \
perl-DBIx-Class-UUIDColumns"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor--Grouped \
perl-DBIx--Class \
perl-Data--UUID"

inherit rpm
