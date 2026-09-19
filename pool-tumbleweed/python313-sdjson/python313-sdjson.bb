SUMMARY = "Custom JSON Encoder utilising functools.singledispatch"
DESCRIPTION = "Custom JSON Encoder for Python utilising functools.singledispatch to support \
custom encoders for both Python's built-in classes and user-created classes, \
without as much legwork."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-sdjson-0.5.0-3.6.noarch.rpm"
RPM_HASH = "aca8721821bee2d2de2352ec817cf786b1f6197d0d44730eb321f565358942b9956da5d8b70990ce276a4c59fd78e09dc6f849f2c7f7c1277b4369a8d6ebebf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sdjson \
python3.13dist-sdjson \
python313-sdjson \
python3dist-sdjson"

RDEPENDS:${PN} += "python-abi \
python313-domdf-python-tools \
python313-typing-extensions"

inherit rpm
