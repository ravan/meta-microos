SUMMARY = "Bash Completion for hugo"
DESCRIPTION = "The official bash completion script for hugo, generated during the build."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "0.166.0"

RPM_NAME = "hugo-bash-completion-0.166.0-1.1.noarch.rpm"
RPM_HASH = "7687a08f8d3a4deac0791c2fe04ced5d524ba6c77be75f7c80df6198c5fd3aa20e44ccc7fc45caeba9ec063c3ca5dc82ff5b3f7c1862f2621ea7c4486750d5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hugo-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
