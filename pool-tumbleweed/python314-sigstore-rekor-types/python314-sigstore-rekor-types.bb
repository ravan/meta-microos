SUMMARY = "Python models for Rekor's API types"
DESCRIPTION = "Python models for Rekor's API types."
LICENSE = "Apache-2.0"

PV = "0.0.18"

RPM_NAME = "python314-sigstore-rekor-types-0.0.18-1.7.noarch.rpm"
RPM_HASH = "d877f58bd943125fcb2471dcb96c1c6c691bf6a26a62074e7da7176fc0ae29ba96c2cd10ee5938aa0dede6676b6f529c0a1c6daaa0cf61d8d4c4c3854bca7456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sigstore-rekor-types \
python314-sigstore-rekor-types \
python3dist-sigstore-rekor-types"

RDEPENDS:${PN} += "python-abi \
python314-pydantic"

inherit rpm
