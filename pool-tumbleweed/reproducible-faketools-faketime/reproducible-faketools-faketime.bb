SUMMARY = "fake time via LD_PRELOAD"
DESCRIPTION = "a script to enhance the reproducibility of the output \
by replacing time(2) and fstat(2) library calls to return our notion of time"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-faketime-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "b34c216d407a4f59789ebdff0ef6b7ea1f0890d0acfde55f1d39b089469c59812ac997af884f7976a4cf96f12c09646a7b0be70ed12d9da3546ed25145e8e585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-faketime"

RDEPENDS:${PN} += "libfaketime \
reproducible-faketools-rpmbuild"

inherit rpm
