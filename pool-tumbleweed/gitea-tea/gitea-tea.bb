SUMMARY = "A command line tool to interact with Gitea servers"
DESCRIPTION = "Tea can be used to manage most entities on one or multiple Gitea \
instances and provides local helpers like 'tea pr checkout'. \
 \
It tries to make use of context provided by the repository in $PWD \
if available. And works best in a upstream/fork workflow, when the \
local main branch tracks the upstream repo. It also assumes that \
local git state is published on the remote before doing operations. \
Configuration lives in $XDG_CONFIG_HOME/tea."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "gitea-tea-0.16.0-1.1.aarch64.rpm"
RPM_HASH = "7c7b07a90a6ec2f04a922304b4d9e049a0a370ef3a56d7e401e38aad4fd3abc0785c7745de44a12d00c360dd83f88a3548b9c0aaae71298f9df34481afe6bd07"

RPROVIDES:${PN} += "gitea-tea"

RDEPENDS:${PN} += "git-core \
libc.so.6"

inherit rpm
