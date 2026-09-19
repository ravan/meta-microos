SUMMARY = "MED documentation"
DESCRIPTION = "MED-fichier (Modélisation et Echanges de Données, \
in English Modelisation and Data Exchange) is a library \
to store and exchange meshed data or computation results. \
It uses the HDF5 file format to store the data."
LICENSE = "LGPL-3.0-only"

PV = "5.0.0"

RPM_NAME = "med-tools-doc-5.0.0-1.6.noarch.rpm"
RPM_HASH = "874bfefaa003ca8ee79df040b4bd43013231bcc965fd2051ae75417facd0c1cab5972b812d815257bfd3019e02feca0565d7476cef524cee4d35994500f4220a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "med-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
