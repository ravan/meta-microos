SUMMARY = "Bash completion for smc-tools"
DESCRIPTION = "This package contains the files to enable command completion for the \
smc-tools package when running a bash shell."
LICENSE = "EPL-1.0"

PV = "1.8.8"

RPM_NAME = "smc-tools-completion-1.8.8-1.1.aarch64.rpm"
RPM_HASH = "7097e29ddbadb2e2c3e0f7eb083ed689f5d08468314b9f22f87e6f3f5942c74c05d76b81d15da721adf0d7484792d7277c6bc5c2bb72a0c28977329cc9d197fe"

RPROVIDES:${PN} += "smc-tools-completion"

RDEPENDS:${PN} += "bash-completion \
smc-tools"

inherit rpm
