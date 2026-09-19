SUMMARY = "Signatures for Python programs (CLI module)"
DESCRIPTION = "CLI module for the project Griffe."
LICENSE = "ISC"

PV = "2.0.2"

RPM_NAME = "python313-griffecli-2.0.2-1.3.noarch.rpm"
RPM_HASH = "9cbeeeea6e9807d8f12c2925ebdfacbbeadb31e4f48df6a22b46174df797270a1de92e2d3200652ae7ec7ef29074ffd86d6bdbad94012832940d80cf383a01fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-griffecli \
python3.13dist-griffecli \
python313-griffecli \
python3dist-griffecli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-colorama \
python313-griffelib"

inherit rpm
