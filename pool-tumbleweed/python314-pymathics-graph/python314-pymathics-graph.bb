SUMMARY = "Mathics Graph functions using NetworkX and Matplotlib"
DESCRIPTION = "PyMathics-Graph is a Mathics3 Graph Module using NetworkX and Matplotlib."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "python314-pymathics-graph-8.0.1-1.5.noarch.rpm"
RPM_HASH = "0629cf2089086ed4349b08e827da2430a10baec83db167077f08957618245a372ba718f7ac6c2fe8898a3c38e3508062ab7c1b5fb9d9fcc345df4f9a4e97f2ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymathics-graph \
python314-pymathics-graph \
python3dist-pymathics-graph"

RDEPENDS:${PN} += "python-abi \
python314-Mathics3 \
python314-matplotlib \
python314-networkx \
python314-pydot \
python314-scipy"

inherit rpm
