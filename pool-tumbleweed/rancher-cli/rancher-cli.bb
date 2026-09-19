SUMMARY = "Rancher CLI"
DESCRIPTION = "The Rancher Command Line Interface (CLI) is a unified tool for interacting with \
your Rancher Server. \
For usage information see: https://rancher.com/docs/rancher/v2.x/en/cli/"
LICENSE = "Apache-2.0"

PV = "2.15.1"

RPM_NAME = "rancher-cli-2.15.1-1.1.aarch64.rpm"
RPM_HASH = "6fb93dc4c5d00c740a56cf8ce09dc2f52ee3a3cc1182792176d5163d3e6b7d349d62ecc0c8f927af92a4f60401e142ffca7aaed033bf8179018a7b7c7b205fae"

RPROVIDES:${PN} += "rancher-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
