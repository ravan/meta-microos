SUMMARY = "Generate jsonschemas from helm charts"
DESCRIPTION = "This tool tries to help you to easily create some nice JSON schema for your helm chart. \
 \
By default it will traverse the current directory and look for Chart.yaml \
files. For every file, helm-schema will try to find one of the given value \
filenames. The first files found will be read and a jsonschema will be created. \
For every dependency defined in the Chart.yaml file, a reference to the \
dependencies JSON schema will be created."
LICENSE = "MIT"

PV = "0.23.5"

RPM_NAME = "helm-schema-0.23.5-1.1.aarch64.rpm"
RPM_HASH = "ecb8df812728027204ce8a4e5d5b8a93aa4f794ebe00210d870d4df9f3f6a104df5b669922663e0267f72ec86ef6faf3949c09f701abad1d5bcdc23759ffc709"

RPROVIDES:${PN} += "helm-schema"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
