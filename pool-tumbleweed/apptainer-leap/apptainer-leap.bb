SUMMARY = "Apptainer Definition File Templates for current openSUSE Leap"
DESCRIPTION = "The package provides a definition file template for Apptainer containers \
based on the latest openSUSE Leap release."
LICENSE = "BSD-3-Clause-LBNL & OpenSSL"

PV = "1.5.3"

RPM_NAME = "apptainer-leap-1.5.3-3.1.noarch.rpm"
RPM_HASH = "227ba47ecbce2107aa1b17c939581c72957ddc48e2e81d32899d18003a7dc96ef4f963ba3e3d038e9047c2da6f17388a385bdf5ba8f22e3abec45cc582a0a4b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apptainer-leap"

RDEPENDS:${PN} += "apptainer"

inherit rpm
