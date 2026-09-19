SUMMARY = "Authorize SSH public keys from online identities"
DESCRIPTION = "A command-line utility that imports SSH public keys to your authorized_keys \
file from online services like GitHub and Launchpad."
LICENSE = "GPL-3.0"

PV = "5.11"

RPM_NAME = "ssh-import-id-5.11-1.17.noarch.rpm"
RPM_HASH = "e04f387623eeab813e1968a1600d4c5655362ae57f88838781156f0570d68471af1497dd2a13ef84db0c20455f6c0afdf90ed9d02075584e459251477ce64a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-ssh-import-id \
python3dist-ssh-import-id \
ssh-import-id"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
openssh-common \
python-abi \
python3.13dist-distro \
python3.13dist-setuptools"

inherit rpm
