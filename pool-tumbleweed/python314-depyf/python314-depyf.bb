SUMMARY = "Decompile python functions, from bytecode to source code"
DESCRIPTION = "depyf decompiles Python bytecode back into readable source code. It is \
designed to help understand and debug PyTorch's torch.compile: it turns \
the bytecode Dynamo produces back into equivalent Python source, and can \
export the intermediate graphs and generated code for inspection so the \
compilation process can be followed step by step."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python314-depyf-0.20.0-1.1.noarch.rpm"
RPM_HASH = "68ea5eef2a0c13c333ad00e42058f8ff9eddf74de57f9338e26f9c8c5a0ff7aad07d80467274ecb517e2bb7b6c424e7c6facc0404317a00556bc66363e9486b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-depyf \
python314-depyf \
python3dist-depyf"

RDEPENDS:${PN} += "python-abi \
python314-astor \
python314-dill"

inherit rpm
