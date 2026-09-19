SUMMARY = "Terminal string styling done right, in Python"
DESCRIPTION = "colorful gives you control over terminal string styling in Python \
with an easy to use API."
LICENSE = "MIT"

PV = "0.5.8"

RPM_NAME = "python313-colorful-0.5.8-1.4.noarch.rpm"
RPM_HASH = "ab88e4ff213cefcabee3435b7134bde40fd11b13320dc4868b2737d8a9a7adb88f0559439db38d4f3f8058ed8bdb83238514855a267417001ec1f97ff5f08c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorful \
python3.13dist-colorful \
python313-colorful \
python3dist-colorful"

RDEPENDS:${PN} += "python-abi"

inherit rpm
