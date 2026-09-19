SUMMARY = "Helper scripts for kernel.org patches"
DESCRIPTION = "This is a helper utility to work with patches made available via a \
public-inbox archive like lore.kernel.org. It is written to make it \
easier to participate in a patch-based workflows, like those used in \
the Linux kernel development. \
 \
The name 'b4' was chosen for ease of typing and because B-4 was the \
precursor to Lore and Data in the Star Trek universe."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.0"

RPM_NAME = "b4-0.16.0-1.1.noarch.rpm"
RPM_HASH = "ec2118a5629734f6d514c9dbd9f445b9906472bfce1b1ddfe43c9e9de67753fcbcd060a3139ad97e05b54df74f67fb14a1fca41ed9d81024613d916e8c70e371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "b4 \
python3.13dist-b4 \
python3dist-b4"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
git-core \
python-abi \
python3-dkimpy \
python3-ezgb \
python3-liblore \
python3-patatt \
python3-pygit2 \
python3-requests"

inherit rpm
