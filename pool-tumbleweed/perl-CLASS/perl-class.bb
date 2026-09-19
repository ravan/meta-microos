SUMMARY = "Alias for __PACKAGE__"
DESCRIPTION = "CLASS and $CLASS are both synonyms for __PACKAGE__. Easier to type. \
 \
$CLASS has the additional benefit of working in strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1.8"

RPM_NAME = "perl-CLASS-1.1.8-1.15.noarch.rpm"
RPM_HASH = "f3e2d59126baaae70651ce9decf0afa86bb06aa9445446e3962a9920a8968f6dbc0c3fecd7b855a3939d52ab4765a28ed31b73c4bdc4522af86e3d8df2aad3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CLASS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
