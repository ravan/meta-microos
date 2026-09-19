SUMMARY = "Example HEP files for testing and demonstrating"
DESCRIPTION = "A common package to provide example files (*e.g*. ROOT) for testing and \
developing packages against.  The sample of files is representative of typical \
files found 'in the wild'. \
 \
In addition to including some root files directly, this package adds some \
simple helper methods to get larger files from common open-access data \
repositories."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "python313-scikit-hep-testdata-0.6.7-1.1.noarch.rpm"
RPM_HASH = "04ddd834fc8954aa801576cfe2d5531bed475930b5638ddec53019b35f40d292150e98d4f43b280b75ed53f61fa8d15a8c67418113f13c42debdd05598b11174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-hep-testdata \
python3.13dist-scikit-hep-testdata \
python313-scikit-hep-testdata \
python3dist-scikit-hep-testdata"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-requests \
scikit-hep-testdata-files \
update-alternatives"

inherit rpm
