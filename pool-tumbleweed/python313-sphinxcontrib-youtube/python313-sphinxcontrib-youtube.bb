SUMMARY = "Sphinx 'youtube' extension"
DESCRIPTION = "Sphinx 'youtube' extension"
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python313-sphinxcontrib-youtube-1.5.0-1.2.noarch.rpm"
RPM_HASH = "f739e931acd94676b8ace5094245752f596722133f31f61e35ccdb3cb726f4d3092424b1b9fec6d699430ec2e66c1c41aa48c2434646cab2dbf4a8460cc05be8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-youtube \
python3.13dist-sphinxcontrib-youtube \
python313-sphinxcontrib-youtube \
python3dist-sphinxcontrib-youtube"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-requests"

inherit rpm
