SUMMARY = "Vestigial utilities from IPython"
DESCRIPTION = "This contains some common utilities shared by Jupyter and IPython projects \
during The Big Split. As soon as possible, those packages will remove their \
dependency on this, and this package will go away. \
 \
No projects should depend on this package directly.  It will be pulled in by \
whatever packages need it"
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python314-ipython_genutils-0.2.0-5.8.noarch.rpm"
RPM_HASH = "6f8f0bc0fc77cd5cfd4980f181aa9048636ee154d52b7ba9f865d64ad575a809bb8c24a7b95f02f726d9a05e88876f34658e9884299473b80df9f42023ea4c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipython-genutils \
python314-ipython-genutils \
python3dist-ipython-genutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
