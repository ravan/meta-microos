SUMMARY = "Sphinx generator for lms-full.txt"
DESCRIPTION = "A Sphinx extension that generates a summary llms.txt file and a single \
combined documentation llms-full.txt file."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python313-sphinx-llms-txt-0.7.1-1.2.noarch.rpm"
RPM_HASH = "06ca99a535a7bf2b4b8def338cf89365c7d9c7a764784fa1cab06d9c0f92a1109966a78ad84f830aba5f1497ebc07509e8ff5c98288b44bcd129953205336d7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-llms-txt \
python3.13dist-sphinx-llms-txt \
python313-sphinx-llms-txt \
python3dist-sphinx-llms-txt"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
