SUMMARY = "Python module for ML content-type detection"
DESCRIPTION = "Magika is an AI-powered file type detection tool. It uses a small \
deep-learning model (a few MiB) to identify 200+ binary and textual \
content types, typically within milliseconds on a single CPU. \
 \
This package provides the Python module and magika-python-client. \
The primary magika command is the separate Rust CLI and is not \
shipped here."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python313-magika-1.0.3-1.1.noarch.rpm"
RPM_HASH = "882eeb88d695c2566a6812cbed06a79dc289fc1a0a2eba81181a99afcea9d08295a731ff1ddea7772f9232c2b138d886977c372bb3ede29e51df1e6b88c053ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magika \
python3.13dist-magika \
python313-magika \
python3dist-magika"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-onnxruntime"

inherit rpm
