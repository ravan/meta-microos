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

PV = "2.6.4"

RPM_NAME = "python310-arf-2.6.4-1.1.noarch.rpm"
RPM_HASH = "633e8a42e43c77553d98a39c6f7b2d3cf4d339bffa60c92a32466d6774a13c4a93e2922f3b3b9f2be82fd5f2658ab8521395bfe28361ebd38663a6b11d08089a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-arf \
python310-arf \
python3dist-arf"

RDEPENDS:${PN} += "python-abi \
python310-h5py"

inherit rpm
