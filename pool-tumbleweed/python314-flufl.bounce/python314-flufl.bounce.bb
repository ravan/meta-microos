SUMMARY = "Email bounce detectors"
DESCRIPTION = "Email bounce detectors."
LICENSE = "Apache-2.0"

PV = "5.0.1"

RPM_NAME = "python314-flufl.bounce-5.0.1-1.2.noarch.rpm"
RPM_HASH = "545acbdd6e8a90e12cb71c45d90896c8dcc6a08cda8253f92bd78944548902af2fa7c1ca5a5d67d709324d30b091ebdac937f35feecfa48aae566a8cb9772adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flufl.bounce \
python314-flufl.bounce \
python3dist-flufl.bounce"

RDEPENDS:${PN} += "python-abi \
python314-atpublic"

inherit rpm
