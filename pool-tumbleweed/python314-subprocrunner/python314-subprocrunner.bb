SUMMARY = "A Python wrapper library for subprocess module"
DESCRIPTION = "A Python wrapper library for subprocess module."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-subprocrunner-2.0.1-2.5.noarch.rpm"
RPM_HASH = "48b051c81045c2d8c7d3422ccefef940612f9db5b59eb59203a3ecf7c0292b028153458159bb24de283dd705e43fa10443d7e9bdc8894be1ba3bc97834e497ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-subprocrunner \
python314-subprocrunner \
python3dist-subprocrunner"

RDEPENDS:${PN} += "python-abi \
python314-loguru \
python314-mbstrdecoder \
python314-typepy"

inherit rpm
