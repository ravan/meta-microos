SUMMARY = "Simple and tiny yield-based trampoline implementation"
DESCRIPTION = "A tiny yield-based trampoline for Python. Recursive functions can recurse \
virtually infinitely by yielding generator calls instead of calling \
themselves directly."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-trampoline-0.1.2-1.1.noarch.rpm"
RPM_HASH = "8b94d3f752acfc03c777dba37a0408878e1a5e77a2f5aaf28bc8b29e889271b0bc5bfc46e8ae45870c0113534c47a0ef248d9c36b14bb2bbfff57808bb249ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trampoline \
python3.13dist-trampoline \
python313-trampoline \
python3dist-trampoline"

RDEPENDS:${PN} += "python-abi"

inherit rpm
