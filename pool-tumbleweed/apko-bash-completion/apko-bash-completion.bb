SUMMARY = "Bash Completion for apko"
DESCRIPTION = "Bash command line completion support for apko."
LICENSE = "Apache-2.0"

PV = "1.2.41"

RPM_NAME = "apko-bash-completion-1.2.41-1.1.noarch.rpm"
RPM_HASH = "e9b2a62cdd390e0567ae9ce368efaa0c9880da97834ed72e0939aa3885283dd2b4a0d5dd4204c11a0adb6f51db2ab5dd32aef6c60d2680b58ec30f451a83a456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apko-bash-completion"

RDEPENDS:${PN} += "apko"

inherit rpm
