SUMMARY = "Compatibility shim providing selectable entry points for older implementations"
DESCRIPTION = "Compatibility shim providing selectable entry points for older implementations"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-backports.entry_points_selectable-1.3.0-2.5.noarch.rpm"
RPM_HASH = "c01a9ff6ffcc2157eac6b9582a78dd06f1f4c9423dec8a8fa6c078d8d20463bdee3367ad1d63d40963bc2dd57a36ee072f68baba8bd55ebd2fe464ee68b2eaeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-backports.entry-points-selectable \
python3.13dist-backports.entry-points-selectable \
python313-backports.entry-points-selectable \
python3dist-backports.entry-points-selectable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
