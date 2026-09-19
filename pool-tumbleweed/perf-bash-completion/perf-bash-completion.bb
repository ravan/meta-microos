SUMMARY = "Bash completion for perf"
DESCRIPTION = "bash command line completion support for perf."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "perf-bash-completion-7.2.5-95.2.aarch64.rpm"
RPM_HASH = "904eb17ca95a0d866f99570ced41d5fc1e50d4a7eadb5c1698fe5f7df23af73c6d4c34c3d4fa6f5ee0330125048b7f3598b0b1289bf3d70cb81b1963fdc133dd"

RPROVIDES:${PN} += "perf-bash-completion"

RDEPENDS:${PN} += "bash-completion \
perf"

inherit rpm
