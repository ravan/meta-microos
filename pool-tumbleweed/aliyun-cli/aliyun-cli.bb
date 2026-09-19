SUMMARY = "Alibaba Cloud CLI"
DESCRIPTION = "The Alibaba Cloud CLI is a tool to manage and use Alibaba Cloud resources \
through a command line interface. It is written in Go and built on the top \
of Alibaba Cloud OpenAPI."
LICENSE = "Apache-2.0"

PV = "3.4.11"

RPM_NAME = "aliyun-cli-3.4.11-1.1.aarch64.rpm"
RPM_HASH = "9dfa7e1bca322b050f612f9421c29283e67f783211ae89902db03c7b2492525e8264ebcdf749a1408eb56d38099a313c0cd5c799079f401330dedbb95e8ff52a"

RPROVIDES:${PN} += "aliyun-cli"

RDEPENDS:${PN} += ""

inherit rpm
