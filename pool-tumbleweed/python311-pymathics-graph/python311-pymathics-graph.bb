SUMMARY = "Mathics Graph functions using NetworkX and Matplotlib"
DESCRIPTION = "PyMathics-Graph is a Mathics3 Graph Module using NetworkX and Matplotlib."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "python311-pymathics-graph-8.0.1-1.5.noarch.rpm"
RPM_HASH = "118eb10ae8e6cf55458c885fa6440fa69c79aeff852a473db7b906b7b1d20f4f93494a910b840d959f78bf8997f71a5636968746fedfb95a87d2690c3b901d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pymathics-graph \
python311-pymathics-graph \
python3dist-pymathics-graph"

RDEPENDS:${PN} += "python-abi \
python311-Mathics3 \
python311-matplotlib \
python311-networkx \
python311-pydot \
python311-scipy"

inherit rpm
