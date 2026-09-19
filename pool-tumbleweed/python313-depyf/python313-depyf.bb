SUMMARY = "Decompile python functions, from bytecode to source code"
DESCRIPTION = "depyf decompiles Python bytecode back into readable source code. It is \
designed to help understand and debug PyTorch's torch.compile: it turns \
the bytecode Dynamo produces back into equivalent Python source, and can \
export the intermediate graphs and generated code for inspection so the \
compilation process can be followed step by step."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python313-depyf-0.20.0-1.1.noarch.rpm"
RPM_HASH = "c89abe191b4cdd2585895fc7805c61803dc09d1b160b9c6bfdcf47f563b3a7c669f74198ba5aa80aabc781a16d23af8f9d071a3268de0cdb7bebe1ed809cb360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-depyf \
python3.13dist-depyf \
python313-depyf \
python3dist-depyf"

RDEPENDS:${PN} += "python-abi \
python313-astor \
python313-dill"

inherit rpm
