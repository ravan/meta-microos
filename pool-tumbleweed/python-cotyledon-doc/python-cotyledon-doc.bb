SUMMARY = "Documentation for cotyledon, a framework for long-running services"
DESCRIPTION = "Cotyledon provides a framework for defining long-running services. \
 \
This package contains documentation files for python-cotyledon."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python-cotyledon-doc-2.2.0-1.3.noarch.rpm"
RPM_HASH = "2b84d9e08329e2721e200c391ef309fcaa43d57b41bf251c0a871692891eb801d3022e801853ab562baf210c855241175eea3e9b49eb553a8cbdbad306a2637a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-cotyledon-doc"

RDEPENDS:${PN} += ""

inherit rpm
