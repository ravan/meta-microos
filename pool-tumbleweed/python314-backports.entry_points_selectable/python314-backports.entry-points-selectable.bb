SUMMARY = "Compatibility shim providing selectable entry points for older implementations"
DESCRIPTION = "Compatibility shim providing selectable entry points for older implementations"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-backports.entry_points_selectable-1.3.0-2.5.noarch.rpm"
RPM_HASH = "72b56786f01e988ff23828ae4f2fb2688f11d48aa8b493ec8e710b35c20540d8571bc2ff686ba08c8d28d9ae5a908c067e5dcdb21d5935d74330acd2487ea08e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-backports.entry-points-selectable \
python314-backports.entry-points-selectable \
python3dist-backports.entry-points-selectable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
