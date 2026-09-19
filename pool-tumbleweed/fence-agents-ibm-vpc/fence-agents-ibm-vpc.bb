SUMMARY = "Fence agent for IBM Cloud VPC"
DESCRIPTION = "Fence agent for IBM Cloud VPC that are accessed via REST API."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-ibm-vpc-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "ebb56d6885cdc503cb25e520b73ce91907fabff126ee542724ac826b8b824133eba6c7a24d3ca375fb61af9124e49e44d566ff99a6612623976b80c363dd6533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-ibm-vpc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm
