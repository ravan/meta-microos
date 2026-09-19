SUMMARY = "Zsh Completion for trurl"
DESCRIPTION = "Zsh command-line completion support for trurl."
LICENSE = "curl"

PV = "0.16.1"

RPM_NAME = "trurl-zsh-completion-0.16.1-4.3.noarch.rpm"
RPM_HASH = "1228ff0ebe521a8bf48667ecf8e001d054d0fb6b04bfd099b891c47400344ef037165913d9b50711f71bf221e26b0e30f184cd8fb7f2a97aed82d6a9e2a379b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trurl-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
