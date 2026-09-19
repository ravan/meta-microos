SUMMARY = "Common example and icons for all python flavors of veusz"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. \
 \
This package provides datafiles, examples, and icons used by all \
python flavours of veusz."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "4.2.1"

RPM_NAME = "veusz-common-4.2.1-1.3.noarch.rpm"
RPM_HASH = "fc9568d40a6eea3bcfcefc23cfdf3b400a75c5759d3da9189c4662afcaf5d2c072bebd7a2a30979c9828f020e2406bcfa2dec27a4d01b400f0fa052fc35d9848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "veusz-common"

RDEPENDS:${PN} += ""

inherit rpm
