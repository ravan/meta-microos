SUMMARY = "CLI to edit GitHub Workflows and pin versions of Actions and Reusable Workflows"
DESCRIPTION = "pinact is a CLI to edit GitHub Workflow and Composite action files and pin \
versions of Actions and Reusable Workflows. pinact can also update their \
versions, verify version annotations, and create reviews."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "pinact-4.1.1-1.1.aarch64.rpm"
RPM_HASH = "5c25cf6d34f4a7bd625bbf56c2909e2ee1290d38e792f5bef95d7cdb3764ccf593a171aac032a9e8baeb0eb77514c13912e5c23fd207744a7b4a15b2fb715b6e"

RPROVIDES:${PN} += "pinact"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
