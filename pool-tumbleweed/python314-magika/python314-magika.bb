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

RPM_NAME = "python314-magika-1.0.3-1.1.noarch.rpm"
RPM_HASH = "5ec3b92751ba479de46dcd019769a4f6c80017e435406733a7a5ee2b52baa2d7bb04a0d957d38e20860b30978c730810f68c1933222937538b8ea63c383ff5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-magika \
python314-magika \
python3dist-magika"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-onnxruntime"

inherit rpm
