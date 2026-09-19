SUMMARY = "Run build with the timestamp set to 16y in the future"
DESCRIPTION = "Run the build with the timestamp set to 16y in the future \
(overridable default)"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-future-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "d5676e1d670d9e5bbb6dbc25349241056fcb14e3d0ee45b3431da098fc3ee370d6c07651321ac2cf41efb1f3ecb128a42b84f8ca843bda741a2e8c954f4f1d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-future"

RDEPENDS:${PN} += "reproducible-faketools-rpmbuild"

inherit rpm
