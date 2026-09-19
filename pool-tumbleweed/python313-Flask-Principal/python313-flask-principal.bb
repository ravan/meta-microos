SUMMARY = "Identity management for flask"
DESCRIPTION = "Flask-Principal provides a very loose framework to tie in providers of \
two types of services, often located in different parts of a web application: \
Authentication providers and User information providers."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-Flask-Principal-0.4.0-5.5.noarch.rpm"
RPM_HASH = "0f7539898c2e5a28e935568a010632880532c7984462ff7e2102e83ef1a4bda47a9be2dd4269364a4b6d59c36e25ced1011f5bf9b2151e207e297f1b4c7fa301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Principal \
python3.13dist-flask-principal \
python313-Flask-Principal \
python3dist-flask-principal"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-blinker"

inherit rpm
