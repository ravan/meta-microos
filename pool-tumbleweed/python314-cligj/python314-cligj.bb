SUMMARY = "Click params for commmand line interfaces to GeoJSON"
DESCRIPTION = "Common arguments and options for GeoJSON processing commands, using Click."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python314-cligj-0.7.2-2.5.noarch.rpm"
RPM_HASH = "cee94f14d9f2cb66c499be709e251a53902cf53a0025271db24610b773c4e805ce6490dd89e66eaff99c4f0d0d77a3be7fb80a031918daf754ec7fa8554d5025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cligj \
python314-cligj \
python3dist-cligj"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
