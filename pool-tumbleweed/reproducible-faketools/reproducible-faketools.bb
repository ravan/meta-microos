SUMMARY = "Fake system tools for reproducible builds"
DESCRIPTION = "These tools are meant to help with reproducible builds. \
This works by masking standard UNIX tools in build environments \
with versions that give more predictable output when $SOURCE_DATE_EPOCH \
is set but just redirect to the normal version otherwise."
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "04251dd1f92a2c10975f6646e2b41ebe88aeee6b097fe36f4cdf8de4373cd52094e9f8f51f7c302742b65224387d692a3de54d883fb2487d3b8dbf384a9e85e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools"

RDEPENDS:${PN} += "bash \
coreutils \
this-is-only-for-build-envs"

inherit rpm
