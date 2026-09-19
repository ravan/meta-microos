SUMMARY = "YaST2 - Asturian Translations"
DESCRIPTION = "YaST2 - Translations for Asturian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ast-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "50efd994be460029389c0ae6bb1ed4888eade2ba0a8eda76e843978cd442cea670a3ea2d465c955c12fea74393f48c17716c60146d53ea00fa5f50ac839f1273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ast \
yast2-trans-ast"

RDEPENDS:${PN} += ""

inherit rpm
