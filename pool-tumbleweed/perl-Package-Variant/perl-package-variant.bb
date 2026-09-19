SUMMARY = "Parameterizable packages"
DESCRIPTION = "This module allows you to build a variable package that contains a package \
template and can use it to build variant packages at runtime. \
 \
Your variable package will export a subroutine which will build a variant \
package, combining its arguments with the template, and return the name of \
the new variant package. \
 \
The implementation does not care about what kind of packages it builds, be \
they simple function exporters, classes, singletons or something entirely \
different."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.003002"

RPM_NAME = "perl-Package-Variant-1.003002-1.41.noarch.rpm"
RPM_HASH = "101889b1ea76f61f8eb05be1f6630315ace5730a1dc157a15d00cc0a7b6e61deed174c3f7ca867c36a730982f691bbeef44b166eca7838d6aa79704cbdd6bad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Package--Variant \
perl-Package-Variant"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Import--Into \
perl-Module--Runtime \
perl-strictures"

inherit rpm
