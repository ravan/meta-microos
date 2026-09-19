SUMMARY = "Scales for Python"
DESCRIPTION = "Mizani is a scales package for graphics."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "python313-mizani-0.14.4-1.3.noarch.rpm"
RPM_HASH = "9c8ab0ab3017d1fd6a823d6700a8e9cf91233e416aaa573d3731942d20a965c1e896f60e5a595e26260d85328964bc8a904d644a9efd3dde8cae35641a0c1123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mizani \
python3.13dist-mizani \
python313-mizani \
python3dist-mizani"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-pandas \
python313-scipy"

inherit rpm
