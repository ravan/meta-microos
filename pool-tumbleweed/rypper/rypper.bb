SUMMARY = "Wrapper around zypper for managing multiple repositories"
DESCRIPTION = "rypper is a wrapper around zypper for performing repository operations \
in batch.  It allows selection of which repositories to operate on via \
a number of different repository selection specifiers."
LICENSE = "GPL-3.0+"

PV = "0.24"

RPM_NAME = "rypper-0.24-1.28.noarch.rpm"
RPM_HASH = "a659d778ca5b209156ea7c793c76a3d435436375fff0fc8286de3ab523246756a5cec305c5dca6cf064c5950b6618ac46d6761abbc806c74120aedf6cd7d195c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rypper"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
zypper"

inherit rpm
