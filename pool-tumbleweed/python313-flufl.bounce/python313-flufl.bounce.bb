SUMMARY = "Email bounce detectors"
DESCRIPTION = "Email bounce detectors."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python313-flufl.bounce-5.0.1-1.2.noarch.rpm"
RPM_HASH = "284099ecabb38671b720e27140b5f3fd226104c24114d0ec69feddd5db8e9ec94f7557532a13da3a40b3d61e2a0be8693d2ecb5bd7d3a054c3313aef8ee2b282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.bounce \
python3.13dist-flufl.bounce \
python313-flufl.bounce \
python3dist-flufl.bounce"

RDEPENDS:${PN} += "python-abi \
python313-atpublic"

inherit rpm
