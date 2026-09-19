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

RPM_NAME = "python311-arf-2.6.4-1.1.noarch.rpm"
RPM_HASH = "5254e15cc82154ccd5b7408213b007f88b7828fb6f8eda364b8dc58bbd6f0002895d6865ea2b765f7f138c5c1b6c316ecb902991f4922c4a8e0232ed4f2129bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arf \
python3.11dist-arf \
python311-arf \
python3dist-arf"

RDEPENDS:${PN} += "python-abi \
python311-h5py"

inherit rpm
