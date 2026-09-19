SUMMARY = "Sphinx extension for masking unsupported directives and roles"
DESCRIPTION = "Sphinx extension for masking unsupported directives and roles."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python314-sphinxnotes-mock-1.1-1.4.noarch.rpm"
RPM_HASH = "1bccc130d8c4e10dcd9df6e95086ee80b6a9f012a48c17803376caeb6729f386e19ad35db1d0117c222524f2610bc551033fbdf5b89bcdd096d4f4c0405904a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxnotes-mock \
python314-sphinxnotes-mock \
python3dist-sphinxnotes-mock"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
