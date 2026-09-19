SUMMARY = "Python module to generate sequence-diagram images from text"
DESCRIPTION = "`seqdiag` generates sequence-diagram image files from spec-text files. \
 \
* Generate sequence-diagram from dot like text (basic feature). \
* Multilingualization for node-label (UTF-8 only)."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python314-seqdiag-3.0.0-2.5.noarch.rpm"
RPM_HASH = "5259dff2b313882d7b9605c2756d6dd1b4419a76c04b0e18737c51281ddb6a658985d351569914ac7add97a318ad7ea6ae99d884332b725c09032875edc26d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-seqdiag \
python314-seqdiag \
python3dist-seqdiag"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-blockdiag \
python314-setuptools"

inherit rpm
