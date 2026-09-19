SUMMARY = "Logging integration for Click"
DESCRIPTION = "Integrates logging with click. \
*This is rather experimental.  See tests for usage for now.*"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-click-log-0.4.0-2.5.noarch.rpm"
RPM_HASH = "d0357761ebc1bdaa21bc3ef9073673caad02c7813f06e3a775c0bed0e95e761e4137d1614e45e21a812c78807174b1f0eb7d099a335bc0b42463aca904f961dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-log \
python3.13dist-click-log \
python313-click-log \
python3dist-click-log"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
