SUMMARY = "Check for uncleaned imports"
DESCRIPTION = "This module lets you check your module's namespaces for imported functions \
you might have forgotten to remove with namespace::autoclean or \
namespace::clean and are therefore available to be called as methods, which \
usually isn't want you want."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.240.0"

RPM_NAME = "perl-Test-CleanNamespaces-0.240.0-1.7.noarch.rpm"
RPM_HASH = "1f6062a5f73f83826831a4c4b9e9dc3b9cb981ff9b4caee5cd023a69c4db91d31f255e34f70bf5a4db52846aaa648b61fe04847d6b15c093ab56616425b5f5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CleanNamespaces \
perl-Test-CleanNamespaces"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Runtime \
perl-Package--Stash \
perl-Role--Tiny \
perl-Sub--Identify"

inherit rpm
