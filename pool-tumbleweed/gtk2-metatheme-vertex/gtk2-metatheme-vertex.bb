SUMMARY = "Vertex GTK+2 Theme"
DESCRIPTION = "Vertex is a modern theme that comes with three variants to choose \
from. The default variant with dark header-bars, a light variant, \
and a dark variant. It supports MATE, Xfce, and Cinnamon. \
 \
This package contains the GTK+2 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20170128"

RPM_NAME = "gtk2-metatheme-vertex-20170128-3.18.noarch.rpm"
RPM_HASH = "29c3ffb8ff7747208d745ffe7a9e510b010fe4237c471daaa94bf3ff87b7242b1701a98e114c8eb8f00e2bad98d1a210c2f2b054c0d61f96d1b99c042bd1c033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-vertex"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-vertex-common"

inherit rpm
