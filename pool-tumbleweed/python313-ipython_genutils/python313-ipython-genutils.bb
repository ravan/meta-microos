SUMMARY = "Vestigial utilities from IPython"
DESCRIPTION = "This contains some common utilities shared by Jupyter and IPython projects \
during The Big Split. As soon as possible, those packages will remove their \
dependency on this, and this package will go away. \
 \
No projects should depend on this package directly.  It will be pulled in by \
whatever packages need it"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python313-ipython_genutils-0.2.0-5.8.noarch.rpm"
RPM_HASH = "cfb22668a45b3648c25261326acc72cc0412c57ad121a6c4d30d1911982cbb9d481be6a6b424f7ed0e94410fb94827c6ee9793e2e1b70f0fcf1eb0e022d291a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipython-genutils \
python3.13dist-ipython-genutils \
python313-ipython-genutils \
python3dist-ipython-genutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
