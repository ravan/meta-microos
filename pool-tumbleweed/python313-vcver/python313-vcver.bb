SUMMARY = "Provide package versions with version control data"
DESCRIPTION = "Python module to provide package versions with version control data."
LICENSE = "MIT"

PV = "0.2.12"

RPM_NAME = "python313-vcver-0.2.12-2.5.noarch.rpm"
RPM_HASH = "452f6d0f8d3f5144d8be8d9221a917764dd2067b45cacdbd633c4677aab4fc416ab23c44ef992661377f032158c7ac5bcf99fe4dd443e890e4b8aeb19ced93df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcver \
python3.13dist-vcver \
python313-vcver \
python3dist-vcver"

RDEPENDS:${PN} += "python-abi \
python313-packaging"

inherit rpm
