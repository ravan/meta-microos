SUMMARY = "Advanced Recording Format for physiology and behavior"
DESCRIPTION = "The Advanced Recording Format ARF is an open standard for storing \
data from neuronal, acoustic, and behavioral experiments in a \
portable, high-performance, archival format. The goal is to enable \
labs to share data and tools, and to allow data to be accessed and \
analyzed for many years in the future. \
 \
ARF is built on the the HDF5 format, and all arf files are accessible \
through standard HDF5 tools, including interfaces to HDF5 written for \
other languages (e.g. MATLAB, Python, etc). ARF comprises a set of \
specifications on how different kinds of data are stored."
LICENSE = "GPL-2.0-only"

PV = "2.6.7"

RPM_NAME = "python313-arf-2.6.7-2.5.noarch.rpm"
RPM_HASH = "71843bbed9de165a2a4adf3b4690f11ad6450ba336753b167f566d409814bcb0375f273615657901a3c425336debddd1ad9e20e8b18edd76f3e62e5a20bedb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arf \
python3.13dist-arf \
python313-arf \
python3dist-arf"

RDEPENDS:${PN} += "python-abi \
python313-h5py"

inherit rpm
