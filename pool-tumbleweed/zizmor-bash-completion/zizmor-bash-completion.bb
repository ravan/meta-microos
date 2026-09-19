SUMMARY = "Bash Completion for zizmor"
DESCRIPTION = "Bash command line completion support for zizmor."
LICENSE = "MIT"

PV = "1.29.0"

RPM_NAME = "zizmor-bash-completion-1.29.0-1.2.noarch.rpm"
RPM_HASH = "e2e315f3b92de5e6fef66b8800520dccfe93a1f44c9344377711fc761a041897c5019964baa353ea2e76a5325fa5d5f693ecad2f4ff6048a91dac4f29be67efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zizmor-bash-completion"

RDEPENDS:${PN} += "bash-completion \
zizmor"

inherit rpm
