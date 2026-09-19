SUMMARY = "A backwards/forwards-compatible fork of distutils.version.LooseVersion"
DESCRIPTION = "A backwards/forwards-compatible fork of distutils.version.LooseVersion, for times when PEP-440 isn't what you need. \
 \
The goal of this package is to be a drop-in replacement for the original LooseVersion. It implements an identical interface and comparison logic to LooseVersion. The only major change is that a looseversion.LooseVersion is comparable to a distutils.version.LooseVersion, which means tools should not need to worry whether all dependencies that use LooseVersion have migrated. \
 \
If you are simply comparing versions of Python packages, consider moving to packaging.version.Version, which follows PEP-440. LooseVersion is better suited to interacting with heterogeneous version schemes that do not follow PEP-440."
LICENSE = "PSF-2.0"

PV = "1.3.0"

RPM_NAME = "python314-looseversion-1.3.0-2.10.noarch.rpm"
RPM_HASH = "ee928d3fc16df247aa4effa9c2f9f7522b6356f990db15c7275f85c0bf7b1ee7d68708ee22b500fbf067612542e65658aff0effe215c14e10c53673c4f80babb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-looseversion \
python314-looseversion \
python3dist-looseversion"

RDEPENDS:${PN} += "python-abi"

inherit rpm
