SUMMARY = "LSC Algorithm Library Applications"
DESCRIPTION = "The LSC Algorithm Library Applications for gravitational wave data analysis. \
This package contains applications that are built on tools in the LSC \
Algorithm Library. \
 \
This package contains the python files"
LICENSE = "GPL-2.0-or-later"

PV = "10.1.0"

RPM_NAME = "python313-lalapps-10.1.0-1.4.aarch64.rpm"
RPM_HASH = "9ac74e8744c38c0d0e100e0993cf0f4bc1b917a9f391ea988c5e8049a4be100a107179edb8b062839c55c50bb288bd6a065e21203cb17b920ca64a8178a4700b"

RPROVIDES:${PN} += "python3-lalapps \
python313-lalapps"

RDEPENDS:${PN} += "python-abi \
python313-h5py \
python313-lal \
python313-lalburst \
python313-lalframe \
python313-lalinference \
python313-lalmetaio \
python313-lalpulsar \
python313-ligo-lw \
python313-ligo-segments \
python313-matplotlib \
python313-numpy \
python313-scipy"

inherit rpm
