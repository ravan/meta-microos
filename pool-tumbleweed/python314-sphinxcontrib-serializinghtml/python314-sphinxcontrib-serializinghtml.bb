SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python314-sphinxcontrib-serializinghtml-2.0.0-1.2.noarch.rpm"
RPM_HASH = "b498543e075391d40776f2ac7317048817daab4da18d37dc97f1d88168f00cafcb3995ee4bd02ab9aa099534809161cc75326de7b3579cdd52fe6a2c78e8821d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-serializinghtml \
python314-sphinxcontrib-serializinghtml \
python3dist-sphinxcontrib-serializinghtml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
