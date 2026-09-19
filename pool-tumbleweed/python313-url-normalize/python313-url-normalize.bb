SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-url-normalize-3.0.0-1.2.noarch.rpm"
RPM_HASH = "0ff09dddee9fef3b642d0aaae5d65d68e20e743e58dd273f4d46d0afbf3f0eb9749c5f5139fd9aacc1ea6e73f072af8fc4f1d720b998500ffc0e721019aa2d46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-url-normalize \
python3.13dist-url-normalize \
python313-url-normalize \
python3dist-url-normalize"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-idna \
update-alternatives"

inherit rpm
