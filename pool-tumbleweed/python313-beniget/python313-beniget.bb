SUMMARY = "Module to extract semantic information about static Python code"
DESCRIPTION = "A module to extract semantic information about static Python code."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python313-beniget-0.5.0-1.1.noarch.rpm"
RPM_HASH = "d375a8e41730cb469c0691bbeb3d601b1f03940116a70fca97c389bf755b62d5142bf830af3e8ffec2a9f1a034bd65f5a005a9caa0645a3e8f14e7d98fb8fc2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-beniget \
python3.13dist-beniget \
python313-beniget \
python3dist-beniget"

RDEPENDS:${PN} += "python-abi \
python313-gast"

inherit rpm
