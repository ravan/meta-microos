SUMMARY = "Module to create (dot) graphs from Python"
DESCRIPTION = "pydot allows to create both directed and non-directed graphs from \
Python. All attributes implemented in the Dot language up to Graphviz \
2.16 are supported."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "python314-pydot-4.0.1-1.4.noarch.rpm"
RPM_HASH = "fa713edfa4bf9f1a1d008f61aa89b93da4dd9de82352339fd7e3ffe96bf432cd3a65de3d781d41673edf01c2af53435849e373d2776e25bcb39af8483488573a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydot \
python314-pydot \
python3dist-pydot"

RDEPENDS:${PN} += "dejavu-fonts \
graphviz \
graphviz-gd \
python-abi \
python314-pyparsing"

inherit rpm
