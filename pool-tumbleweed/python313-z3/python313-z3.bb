SUMMARY = "Python bindings for z3"
DESCRIPTION = "Z3 is a theorem prover from Microsoft Research. \
 \
Python bindings for the module."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python313-z3-5.1.0-1.1.noarch.rpm"
RPM_HASH = "c4b61dd3b8c331652856e84f7aadcb9f74230654a17c4a41e8c5e7a614c2768c7e8df435b836ff31af31df4e492878ce0b32b2fd55365e64ee7880554de41e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-z3 \
python3.13dist-z3-solver \
python313-z3 \
python3dist-z3-solver"

RDEPENDS:${PN} += "libz3-5-1 \
python-abi"

inherit rpm
