SUMMARY = "Development files for python314-editdistance"
DESCRIPTION = "This package contains the files needed for binding the python314-editdistance C module."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python314-editdistance-devel-0.8.1-1.4.aarch64.rpm"
RPM_HASH = "e08e2fba059caecc7436162fcfa4de37eae874b0f28135d14364b1f01b289d88a87136a5d0b24fe953377779d79a7bc25f213c8fa1a762053630827303809cb6"

RPROVIDES:${PN} += "python314-editdistance-devel"

RDEPENDS:${PN} += "python314-base \
python314-editdistance"

inherit rpm
