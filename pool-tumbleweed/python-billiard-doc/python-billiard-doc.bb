SUMMARY = "Documentation for python-billiard"
DESCRIPTION = "Documentation and help files for python-billiard."
LICENSE = "BSD-3-Clause"

PV = "4.2.4"

RPM_NAME = "python-billiard-doc-4.2.4-2.2.noarch.rpm"
RPM_HASH = "9e76978720bcbf78269b820afe2d610ea598424764be4c630aec94babaf351661e887a8a1074ce8f76619bdf62c8392e82d588cc1cf56000d30e7f89a7c62c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-billiard-doc \
python2-billiard \
python313-billiard-doc \
python314-billiard-doc"

RDEPENDS:${PN} += ""

inherit rpm
