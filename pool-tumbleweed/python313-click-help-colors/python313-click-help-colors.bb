SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python313-click-help-colors-0.9.4-2.5.noarch.rpm"
RPM_HASH = "a454036aa35071ac08edf68d8ffb3bc64fab15a95740d0fd16c6bb3804f9543cc2c8be70728ff560d62b95a6828d3badeec32e3d85d1dc12c2585b2310c0d637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-help-colors \
python3.13dist-click-help-colors \
python313-click-help-colors \
python3dist-click-help-colors"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
