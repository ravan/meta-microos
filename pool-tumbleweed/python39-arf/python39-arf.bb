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

RPM_NAME = "python39-arf-2.6.4-1.1.noarch.rpm"
RPM_HASH = "da550891bfb06b907c6fb820d0a19b8b68b0e5d665ed011ec54b07ba50aa037fc8a7b09c026e483a035fac94b32697ffd91726d6903ddc9576040cf2b225274e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-arf \
python39-arf \
python3dist-arf"

RDEPENDS:${PN} += "python-abi \
python39-h5py"

inherit rpm
