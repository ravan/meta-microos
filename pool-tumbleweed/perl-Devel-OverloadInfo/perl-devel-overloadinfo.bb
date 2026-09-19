SUMMARY = "Introspect overloaded operators"
DESCRIPTION = "Devel::OverloadInfo returns information about overloaded operators for a \
given class (or object), including where in the inheritance hierarchy the \
overloads are declared and where the code implementing them is."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.8.0"

RPM_NAME = "perl-Devel-OverloadInfo-0.8.0-2.1.noarch.rpm"
RPM_HASH = "8a28d87c606853177d9201302052ab0123c498e83bbd73c08a547abfe54dd97f743fc1d81e51421b245bf28f9184fc2776d3317ebfc47cca003c6d003acaa031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--OverloadInfo \
perl-Devel-OverloadInfo"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MRO--Compat \
perl-Package--Stash \
perl-Sub--Util"

inherit rpm
