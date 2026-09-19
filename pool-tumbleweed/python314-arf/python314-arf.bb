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

RPM_NAME = "python314-arf-2.6.7-2.5.noarch.rpm"
RPM_HASH = "1472448243b342aff8a9420e614ea4481865bcadac9a457edd683b79a7adfdc7f4a6c940cfae06c03b4535e89001d2f054dd48068f186c98b6df02d6bf14100b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-arf \
python314-arf \
python3dist-arf"

RDEPENDS:${PN} += "python-abi \
python314-h5py"

inherit rpm
