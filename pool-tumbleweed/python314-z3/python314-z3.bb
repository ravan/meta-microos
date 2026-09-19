SUMMARY = "Python bindings for z3"
DESCRIPTION = "Z3 is a theorem prover from Microsoft Research. \
 \
Python bindings for the module."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python314-z3-5.1.0-1.1.noarch.rpm"
RPM_HASH = "6e1eadb3da4ab398b389c5e82f6c46fe4c957c94e374fa0d061a2b574ddda40e6bfe71cbd4dae0a2b6d1430d53bda2cea67df8c70e26b00dd482c03c89897fe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-z3 \
python3.14dist-z3-solver \
python314-z3 \
python3dist-z3-solver"

RDEPENDS:${PN} += "libz3-5-1 \
python-abi"

inherit rpm
