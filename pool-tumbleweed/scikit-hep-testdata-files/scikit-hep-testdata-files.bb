SUMMARY = "Example HEP files for testing and demonstrating - common file package"
DESCRIPTION = "A common package to provide example files (*e.g*. ROOT) for testing and \
developing packages against.  The sample of files is representative of typical \
files found 'in the wild'. \
 \
In addition to including some root files directly, this package adds some \
simple helper methods to get larger files from common open-access data \
repositories. \
 \
This subpackage contains the data files for all python flavors."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "scikit-hep-testdata-files-0.6.7-1.1.noarch.rpm"
RPM_HASH = "40029869df17c4965a54f6d189fffefd5d14a50684475a5f73204f03e472b21db8561378e7fb22c85e5be690fc1c64f9cd3d8663e108c755d83725b91aa05df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scikit-hep-testdata-files"

RDEPENDS:${PN} += ""

inherit rpm
