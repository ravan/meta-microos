SUMMARY = "Python models for Rekor's API types"
DESCRIPTION = "Python models for Rekor's API types."
LICENSE = "Apache-2.0"

PV = "0.0.18"

RPM_NAME = "python313-sigstore-rekor-types-0.0.18-1.7.noarch.rpm"
RPM_HASH = "98570bd911b13c5675aa979c39660008676a4ba35fbc49f244d500a50a0941a2826cb727772e62e2b86e176f91f145ea78a92aa25328ce9796b0aaba65832ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sigstore-rekor-types \
python3.13dist-sigstore-rekor-types \
python313-sigstore-rekor-types \
python3dist-sigstore-rekor-types"

RDEPENDS:${PN} += "python-abi \
python313-pydantic"

inherit rpm
