SUMMARY = "Small extension for Flask to make usage of Gravatar service"
DESCRIPTION = "Small extension for Flask to make usage of the Gravatar service."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python313-Flask-Gravatar-0.5.0-7.5.noarch.rpm"
RPM_HASH = "d3ef4bf50c1aeb943aaae1460b195f7684afc4bf7da7f40a37ccb90bea83aca186da7161031a7d94bb04f5174cc6de82795b672908f98b109e441d4095e77b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Gravatar \
python3.13dist-flask-gravatar \
python313-Flask-Gravatar \
python3dist-flask-gravatar"

RDEPENDS:${PN} += "python-abi \
python313-Flask"

inherit rpm
