SUMMARY = "Tutorial for javassist"
DESCRIPTION = "Tutorial for javassist. \
 \
Tutorial for javassist."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.30.2"

RPM_NAME = "javassist-manual-3.30.2-1.8.noarch.rpm"
RPM_HASH = "935476706ba15dfa790e1fe38e3638f87d3cb3223999c1bd85508a3688393026dd081c91fd92a68f3a05d5dfc52a281ca59955e62725c97d4026a1af11b3a09c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist-manual"

RDEPENDS:${PN} += ""

inherit rpm
