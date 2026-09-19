SUMMARY = "Tools for accessing JPEG2000 files"
DESCRIPTION = "Python interface to the OpenJPEG library"
LICENSE = "MIT"

PV = "0.14.8"

RPM_NAME = "python313-Glymur-0.14.8-1.2.noarch.rpm"
RPM_HASH = "2a2ca3b5510fdd2467782cdd5b994323fecaf860bbf75bb87317374ac865ec51224793f1fb1d1656c3f401796dcdb789667c9b908d8b9fd7bc55b760356e21f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Glymur \
python3.13dist-glymur \
python313-Glymur \
python3dist-glymur"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-lxml \
python313-numpy \
update-alternatives"

inherit rpm
