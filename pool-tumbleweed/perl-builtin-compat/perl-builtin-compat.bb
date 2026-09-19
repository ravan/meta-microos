SUMMARY = "Provide builtin functions for older perl versions"
DESCRIPTION = "Provides builtin functions for perl versions that do not include the \
builtin module. \
 \
No functions are exported by default. \
 \
This module does its best to behave similar to builtin, which creates its \
exported functions as lexicals. The functions will be created in the \
currently compiling scope, not the immediate caller of \
'builtin::compat->import'. The functions will also be removed at the end of \
the compilation scope using namespace::clean. \
 \
The builtin functions will be used directly when they are available."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.3.3"

RPM_NAME = "perl-builtin-compat-0.3.3-1.3.noarch.rpm"
RPM_HASH = "44d5536b07f2488c17f9429acb0e9b6b00fb85791458755fc6bfa45f7ed8c00a24c85d8b036f1182985c697a1db8f9d7dd8f0d6e297bab0f381f149788c4d71e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-builtin--compat \
perl-builtin-compat"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Scalar--Util \
perl-namespace--clean"

inherit rpm
