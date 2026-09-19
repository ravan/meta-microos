SUMMARY = "Email reply parser"
DESCRIPTION = "Email reply parser."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "python313-email-reply-parser-0.5.12-2.5.noarch.rpm"
RPM_HASH = "742cbe8c5ac2612ff735dc1f6394a73b864d24123ed79e7832e1def51cb4beffe348a7881304334060c18ce45909012fbd8ca6f8f92761f601b36c9ff8005c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-email-reply-parser \
python3.13dist-email-reply-parser \
python313-email-reply-parser \
python3dist-email-reply-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
