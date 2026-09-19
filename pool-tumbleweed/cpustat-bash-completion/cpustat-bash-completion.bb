SUMMARY = "Bash Completion for cpustat"
DESCRIPTION = "Bash completion script for cpustat."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.15"

RPM_NAME = "cpustat-bash-completion-0.02.15-1.20.noarch.rpm"
RPM_HASH = "292d758b0f5cf7cfe37f22b35054a2ee08d932729072fd9aa970bb434723cfa23be99ccc42adc4fcb1e3bf7b02c407325b3b507e7c8aeaa794de9d2ddd86d306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpustat-bash-completion"

RDEPENDS:${PN} += "bash-completion \
cpustat"

inherit rpm
