SUMMARY = "Python module to generate sequence-diagram images from text"
DESCRIPTION = "`seqdiag` generates sequence-diagram image files from spec-text files. \
 \
* Generate sequence-diagram from dot like text (basic feature). \
* Multilingualization for node-label (UTF-8 only)."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python313-seqdiag-3.0.0-2.5.noarch.rpm"
RPM_HASH = "c6fe023a35a045ba608183c5525b65a7a948748cea8c6c605400f86e4e7328a27300fe793603c6c676244af377deb8881378ae8a516e6921625254c85500aa5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-seqdiag \
python3.13dist-seqdiag \
python313-seqdiag \
python3dist-seqdiag"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-blockdiag \
python313-setuptools"

inherit rpm
