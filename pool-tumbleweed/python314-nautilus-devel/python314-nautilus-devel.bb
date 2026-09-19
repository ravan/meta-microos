SUMMARY = "Metapackage to pull in all of python-nautilus' packages"
DESCRIPTION = "This package contains files required to build wrappers for python-nautilus."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "python314-nautilus-devel-4.1.0-1.7.aarch64.rpm"
RPM_HASH = "6ab13f33c45050779b9ceff64de2813abb0c74240e937e847d3c216f666eb42a9371f3cf78396eaf22e8434f7962246e86a3d38774da46d4b07571dd54d01bdf"

RPROVIDES:${PN} += "python314-nautilus-devel"

RDEPENDS:${PN} += "python314-devel \
python314-nautilus \
python314-nautilus-common-devel"

inherit rpm
