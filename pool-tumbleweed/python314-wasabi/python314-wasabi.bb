SUMMARY = "A lightweight console printing and formatting toolkit"
DESCRIPTION = "A lightweight console printing and formatting toolkit."
LICENSE = "LGPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "python314-wasabi-1.1.3-1.9.noarch.rpm"
RPM_HASH = "465ea04df651359605bc9c67a07b998fd15128a3685604a73dec38af591abbe467d68098cb07d7697b5504dc2ddce085ebe00e001f9f779e5e7385e2ff04e6aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wasabi \
python314-wasabi \
python3dist-wasabi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
