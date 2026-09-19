SUMMARY = "LSC Algorithm Library Applications"
DESCRIPTION = "The LSC Algorithm Library Applications for gravitational wave data analysis. \
This package contains applications that are built on tools in the LSC \
Algorithm Library. \
 \
This package contains the python files"
LICENSE = "GPL-2.0-or-later"

PV = "10.1.0"

RPM_NAME = "python314-lalapps-10.1.0-1.4.aarch64.rpm"
RPM_HASH = "2b5028fd02d358324e4a97cd1c412a50fbf6c1340d8a0b65068ecbb7bfee7293b2d4f49b35e56ea4fa5382043bb89e9a97753042a8560d3829cfa509bdea1172"

RPROVIDES:${PN} += "python314-lalapps"

RDEPENDS:${PN} += "python-abi \
python314-h5py \
python314-lal \
python314-lalburst \
python314-lalframe \
python314-lalinference \
python314-lalmetaio \
python314-lalpulsar \
python314-ligo-lw \
python314-ligo-segments \
python314-matplotlib \
python314-numpy \
python314-scipy"

inherit rpm
