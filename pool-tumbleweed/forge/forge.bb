SUMMARY = "A command line tool to interact with git forges"
DESCRIPTION = "Go library and CLI for working with git forges. Supports GitHub, GitLab, \
Gitea/Forgejo, and Bitbucket Cloud through a single interface."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "forge-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "71ab24e44cff7aac1dfce5c24b61c7d378cc2ccdb371b20913da71fcfe0fac13802ea711b2b19d64fa5b484960ae971f03a8a367f81cfc9856355b238d734d3b"

RPROVIDES:${PN} += "forge"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
