SUMMARY = "A backwards/forwards-compatible fork of distutils.version.LooseVersion"
DESCRIPTION = "A backwards/forwards-compatible fork of distutils.version.LooseVersion, for times when PEP-440 isn't what you need. \
 \
The goal of this package is to be a drop-in replacement for the original LooseVersion. It implements an identical interface and comparison logic to LooseVersion. The only major change is that a looseversion.LooseVersion is comparable to a distutils.version.LooseVersion, which means tools should not need to worry whether all dependencies that use LooseVersion have migrated. \
 \
If you are simply comparing versions of Python packages, consider moving to packaging.version.Version, which follows PEP-440. LooseVersion is better suited to interacting with heterogeneous version schemes that do not follow PEP-440."
LICENSE = "PSF-2.0"

PV = "1.3.0"

RPM_NAME = "python313-looseversion-1.3.0-2.10.noarch.rpm"
RPM_HASH = "c5217751df5e3366200e895b80e6e3a53501404346c81f98c258d995620279072f2d9ddb095dd6ddd51792398483658480530032afc219c593b9f4de9d8bc346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-looseversion \
python3.13dist-looseversion \
python313-looseversion \
python3dist-looseversion"

RDEPENDS:${PN} += "python-abi"

inherit rpm
