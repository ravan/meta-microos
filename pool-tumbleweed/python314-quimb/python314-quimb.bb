SUMMARY = "Python library for quantum information and many-body calculations"
DESCRIPTION = "quimb is an easy but fast python library for quantum information and \
many-body calculations, including with tensor networks."
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python314-quimb-1.14.0-1.2.noarch.rpm"
RPM_HASH = "cb2263bb46f1957076cf30af7e2a819c3d3c176600d9ed7e6f04bb6dd1408c96806bbd9cd6723aacd77f310a750f880dd469a995d86fd23801e426ce17221de9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-quimb \
python314-quimb \
python3dist-quimb"

RDEPENDS:${PN} += "python-abi \
python314-autoray \
python314-cotengra \
python314-cytoolz \
python314-numba \
python314-numpy \
python314-psutil \
python314-scipy \
python314-tqdm \
update-alternatives"

inherit rpm
