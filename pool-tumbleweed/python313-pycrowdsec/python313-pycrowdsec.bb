SUMMARY = "Python bouncer and clients for crowdsec"
DESCRIPTION = "Python bouncer and clients for crowdsec"
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python313-pycrowdsec-0.0.5-1.5.noarch.rpm"
RPM_HASH = "e1426857184f91bed5a7e60044a288af6dfaf4154b51b6d3b3dfe3a5176d6a09181d02abe1cef181c6ce0afd09ff8cc80ed1c1007675142427729579bbfc3236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycrowdsec \
python3.13dist-pycrowdsec \
python313-pycrowdsec \
python3dist-pycrowdsec"

RDEPENDS:${PN} += "python-abi \
python313-importlib-metadata \
python313-requests"

inherit rpm
