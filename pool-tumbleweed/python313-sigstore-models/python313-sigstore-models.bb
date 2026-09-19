SUMMARY = "Pydantic based models for Sigstore's protobuf specifications"
DESCRIPTION = "Pydantic-based data models for Sigstore. \
 \
These models mirror the subset of the [protobuf-specs] that \
are used by the [sigstore-python] library."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python313-sigstore-models-0.0.6-1.4.noarch.rpm"
RPM_HASH = "dcc223b0e445f7d958fca7bb0a886e53c85447a2d291a2c1a6b907828c49d453944403b22e225020b3fbf85e43195266e60a221063164d98dd1ac1c205c7fc93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sigstore-models \
python3.13dist-sigstore-models \
python313-sigstore-models \
python3dist-sigstore-models"

RDEPENDS:${PN} += "python-abi \
python313-pydantic \
python313-typing-extensions"

inherit rpm
