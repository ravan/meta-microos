SUMMARY = "Files to use compleat in the fish shell"
DESCRIPTION = " \
Contains a script that is automatically loaded by the fish shell on startup to \
setup the automatic completion by compleat."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-fish-1.0+git.20220402.ec8fccc-1.25.noarch.rpm"
RPM_HASH = "bbc18814c48964d4a6fb3785608b16d8b363c28e1186c98522667b7f82c848c4503a191d32d117ec0d16b7e8807c346011a19d327a7ec2814709baa837c0e892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compleat-fish"

RDEPENDS:${PN} += "compleat"

inherit rpm
