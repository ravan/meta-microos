SUMMARY = "Signatures for Python programs (CLI module)"
DESCRIPTION = "CLI module for the project Griffe."
LICENSE = "ISC"

PV = "2.0.2"

RPM_NAME = "python314-griffecli-2.0.2-1.3.noarch.rpm"
RPM_HASH = "7e520b7207f54374802ed7c74528b3e865512c700766abee1045b50554a7d6a9bc3bb497e8ccd6e9cb0e74457d31e5553d31b0cbf87c1ff2b70595fc310be432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-griffecli \
python314-griffecli \
python3dist-griffecli"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-colorama \
python314-griffelib"

inherit rpm
