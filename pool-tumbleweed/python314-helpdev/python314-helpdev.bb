SUMMARY = "HelpDev - Extracts information about the Python environment easily"
DESCRIPTION = "HelpDev - Extracts information about the Python environment easily."
LICENSE = "CC-BY-4.0 & MIT"

PV = "0.7.1"

RPM_NAME = "python314-helpdev-0.7.1-4.5.noarch.rpm"
RPM_HASH = "b7970492560b5128e36d1cfe3e70162de6c997fff8c48522fd1648e31959f1b254f7fade4bfcbc20ce3b0a4083cda1cd28eceacfe986cd5c0f6b7b4cc22e18c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-helpdev \
python314-helpdev \
python3dist-helpdev"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-importlib-metadata \
python314-psutil"

inherit rpm
