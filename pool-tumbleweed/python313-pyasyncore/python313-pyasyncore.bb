SUMMARY = "Make asyncore available for Python 3.12 onwards"
DESCRIPTION = "Make asyncore available for Python 3.12 onwards"
LICENSE = "PSF-2.0"

PV = "1.0.5"

RPM_NAME = "python313-pyasyncore-1.0.5-1.3.noarch.rpm"
RPM_HASH = "caf74eeda8baa0ae4eba651a010650da3a12702cec0e826c65aee47d7b6010e187dfd27c3f17d1e922f24ae02e50c3aecfc9fc850c3feca129c6b10382bbb0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyasyncore \
python3.13dist-pyasyncore \
python313-pyasyncore \
python3dist-pyasyncore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
