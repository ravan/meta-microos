SUMMARY = "Pydantic based models for Sigstore's protobuf specifications"
DESCRIPTION = "Pydantic-based data models for Sigstore. \
 \
These models mirror the subset of the [protobuf-specs] that \
are used by the [sigstore-python] library."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python314-sigstore-models-0.0.6-1.4.noarch.rpm"
RPM_HASH = "2446c8b5e1e0f4c908cb4700bf24fda553451f8777c70324e1a1369592a9028db8c939e61781e14b9da2482fd20d2cba846c0eff24ebf6536ffc46242530b290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sigstore-models \
python314-sigstore-models \
python3dist-sigstore-models"

RDEPENDS:${PN} += "python-abi \
python314-pydantic \
python314-typing-extensions"

inherit rpm
