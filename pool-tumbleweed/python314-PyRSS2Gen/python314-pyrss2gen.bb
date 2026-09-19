SUMMARY = "Generate RSS2 using a Python data structure"
DESCRIPTION = "A Python library for generating RSS 2.0 feeds."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python314-PyRSS2Gen-1.1-3.5.noarch.rpm"
RPM_HASH = "5bcf33c4c294fbdb0eb9bedf655afbd61fc821bfcc5e87a002ba1a2b0c55054763e3eb6c1b21c3aec68f2f3a182eea0cf28062e779020f194a0d6d67a3c0cf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyrss2gen \
python3.14dist-pyrss2gen \
python314-PyRSS2Gen \
python3dist-pyrss2gen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
