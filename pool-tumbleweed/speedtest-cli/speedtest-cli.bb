SUMMARY = "Command line interface for testing internet bandwidth"
DESCRIPTION = "Command line interface for testing internet bandwidth using \
speedtest.net"
LICENSE = "Apache-2.0"

PV = "2.1.3"

RPM_NAME = "speedtest-cli-2.1.3-3.8.noarch.rpm"
RPM_HASH = "c49a3a30bd4a0acbcc63be984788984de690be1e59c0d9f3658b61d2ddc90bc945a8839ad7bb292c0e7956e91af3c4c89a2680168988319011cf786a272fc27e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-speedtest-cli \
python3dist-speedtest-cli \
speedtest-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
