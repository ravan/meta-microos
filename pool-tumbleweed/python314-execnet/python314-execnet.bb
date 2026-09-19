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

RPM_NAME = "python314-execnet-2.1.2-1.1.noarch.rpm"
RPM_HASH = "054970ae4eb0bdf018025413e5382e89752a2576aa6c538580f9070673c8c61fe7a3f492e77321e5205c8e2fc8349fa478ee5173bab7f5b6a23218c73b94e252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-execnet \
python314-execnet \
python3dist-execnet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
