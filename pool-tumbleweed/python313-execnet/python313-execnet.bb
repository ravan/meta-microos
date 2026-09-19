SUMMARY = "Rapid multi-Python deployment"
DESCRIPTION = "execnet provides a share-nothing model with \
channel-send/receive communication for distributing \
execution across many Python interpreters across version, \
platform and network barriers. It has a minimal and fast \
API targetting the following uses: \
 \
 * distribute tasks to (many) local or remote CPUs \
 * write and deploy hybrid multi-process applications \
 * write scripts to administer multiple environments"
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python313-execnet-2.1.2-1.1.noarch.rpm"
RPM_HASH = "7e58030ba75a47d64c682edbc89716e455c3ed97e92a09d24c76bc02980432c246f1667a531a2d7561f17be401f160af684fdf8bc6388c78b2f53c14921635b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-execnet \
python3.13dist-execnet \
python313-execnet \
python3dist-execnet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
