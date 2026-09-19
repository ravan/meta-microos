SUMMARY = "An interative animation framework for matplotlib"
DESCRIPTION = "Aframework for creating interactive animations with matplotlib. \
It is designed to handle N-dimensional data, and can be used to create animations."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "python314-mpl-animators-1.2.4-2.5.noarch.rpm"
RPM_HASH = "0a2aaf9a6e1ae4ac882c51ca961f0749af51d7102ab105c200dc6287377a94b9e447f383c94e9ce69bbc0128918a7f33c31d7c7fc056b739b4f358343a84921a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mpl-animators \
python314-mpl-animators \
python3dist-mpl-animators"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy"

inherit rpm
