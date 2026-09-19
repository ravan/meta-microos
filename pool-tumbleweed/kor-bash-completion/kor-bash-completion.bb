SUMMARY = "Bash Completion for kor"
DESCRIPTION = "Bash command line completion support for kor."
LICENSE = "MIT"

PV = "0.6.8"

RPM_NAME = "kor-bash-completion-0.6.8-1.4.noarch.rpm"
RPM_HASH = "fc5c3f24f2209ded916db42c3887bb481462a32a78d7cf55a77eeb77928fdb240618df3b9b0c3c5a2b0d6fa85ffdc5ae23d0da7226fea6692122ad905b382b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kor-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kor"

inherit rpm
