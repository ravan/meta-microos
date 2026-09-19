SUMMARY = "Vertex GTK+3 Theme"
DESCRIPTION = "Vertex is a modern theme that comes with three variants to choose \
from. The default variant with dark header-bars, a light variant, \
and a dark variant. It supports MATE, Xfce, and Cinnamon. \
 \
This package contains the GTK+3 theme."
LICENSE = "GPL-3.0-or-later"

PV = "20170128"

RPM_NAME = "gtk3-metatheme-vertex-20170128-3.18.noarch.rpm"
RPM_HASH = "e628211eb307d6bfdb8962a050e0f8899c9d7d6870cbf73b177c7f358aefc781cbc49407210e777a03fc20a2f251b59648572fe5e8683d4082115d2968329d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-vertex"

RDEPENDS:${PN} += "gtk3 \
metatheme-vertex-common"

inherit rpm
