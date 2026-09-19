SUMMARY = "Compute distance between the two texts"
DESCRIPTION = "Compute distance between sequences. 30+ algorithms, pure python \
implementation, common interface, optional external libs usage."
LICENSE = "MIT"

PV = "4.6.3"

RPM_NAME = "python314-textdistance-4.6.3-2.5.noarch.rpm"
RPM_HASH = "bde7c3a6c3757790f343b2895898964b63262003cb0783c8b2d2ee0749346cea6d28a4a65acff46021ccfc2ce764944df44c2006d7e4d3aac3642c3a4304b424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-textdistance \
python314-textdistance \
python3dist-textdistance"

RDEPENDS:${PN} += "python-abi"

inherit rpm
