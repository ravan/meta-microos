SUMMARY = "Bash Completion for nmap-parse-output"
DESCRIPTION = "Bash completion script for nmap-parse-output."
LICENSE = "BSD-3-Clause"

PV = "1.5.1"

RPM_NAME = "nmap-parse-output-bash-completion-1.5.1-3.7.noarch.rpm"
RPM_HASH = "2fb3f61f8cdb691fd364aaa6fc3ca36915b847b7487a69a871efe84dee5e35b69f086f655d0b9ba2eccaacba2f9cc3015525f7dcd9f2f570ef85ac7f2527736f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nmap-parse-output-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nmap-parse-output"

inherit rpm
