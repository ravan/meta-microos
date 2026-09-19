SUMMARY = "Data files required by all builds of MAME"
DESCRIPTION = "This package contains all data files needed by the MAME binaries: \
 * shaders \
 * artwork \
 * rom hashes \
 * languages"
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.289"

RPM_NAME = "mame-data-0.289-1.1.noarch.rpm"
RPM_HASH = "2f7e39486a52056c573c052d4866ce300aa77ee8ba741ee32917d80bb1215880a6bc85fb73c5c05651f46d5b82d89aef6ec947d2d40c8fb2548a4128eb054736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mame-data"

RDEPENDS:${PN} += ""

inherit rpm
