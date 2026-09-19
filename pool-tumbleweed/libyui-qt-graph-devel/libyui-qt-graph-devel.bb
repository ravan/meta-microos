SUMMARY = "Libyui - Header files for the Qt graph widget"
DESCRIPTION = "This package contains the header files for the Qt graph component \
for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-qt-graph-devel-4.7.7-1.1.aarch64.rpm"
RPM_HASH = "e6347e0e63281c484fc9ff3ba96016b5005823388b186137e83a4280c13affdf16cd45ca4b45730f65ffad153417bc7bae5932cc78638dcb2f2b881b09a05653"

RPROVIDES:${PN} += "libyui-qt-graph-devel"

RDEPENDS:${PN} += "libyui-qt-devel \
libyui-qt-graph16"

inherit rpm
