SUMMARY = "Bash Completion for river"
DESCRIPTION = "Bash command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.3.12"

RPM_NAME = "river-bash-completion-0.3.12-2.6.noarch.rpm"
RPM_HASH = "52e7655166e8bf860e9aeccd32f38deac4889004da0219e3554f67481fe0fdb69d702fad0a42aa32e9c0e411ddb8add530a8db06bbaed19476fc9af492bc5957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-bash-completion"

RDEPENDS:${PN} += "bash-completion \
river"

inherit rpm
