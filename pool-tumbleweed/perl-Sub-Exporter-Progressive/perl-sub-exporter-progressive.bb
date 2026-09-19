SUMMARY = "Only use Sub::Exporter if you need it"
DESCRIPTION = "Sub::Exporter is an incredibly powerful module, but with that power comes \
great responsibility, er- as well as some runtime penalties. This module is \
a 'Sub::Exporter' wrapper that will let your users just use Exporter if all \
they are doing is picking exports, but use 'Sub::Exporter' if your users \
try to use 'Sub::Exporter''s more advanced features, like renaming exports, \
if they try to use them. \
 \
Note that this module will export '@EXPORT', '@EXPORT_OK' and \
'%EXPORT_TAGS' package variables for 'Exporter' to work. Additionally, if \
your package uses advanced 'Sub::Exporter' features like currying, this \
module will only ever use 'Sub::Exporter', so you might as well use it \
directly."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.001013"

RPM_NAME = "perl-Sub-Exporter-Progressive-0.001013-1.39.noarch.rpm"
RPM_HASH = "83fcb107e6cea3a13183e37b0f84402205d1b93fe27c6cc1992f08f1e658ffcf8c8d976720f9d4d18b5f37689771e5435eea80b48b15c54b6b7b85714087a6ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Exporter--Progressive \
perl-Sub-Exporter-Progressive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
