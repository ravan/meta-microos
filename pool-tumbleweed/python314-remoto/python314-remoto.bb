SUMMARY = "Remote command executor using ssh and Python in the remote end"
DESCRIPTION = "Remote command executor using ssh and Python in the remote end. This \
package is primarily built to support the ceph-deploy project. \
python-remoto is built upon python-execnet which manages the \
connections and processes."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python314-remoto-1.2.1-2.9.noarch.rpm"
RPM_HASH = "08becfa68582b221f489a025b1f67b2e79f20e5a04753efb287e554137c4af5b15395f4695e3f456181d583f2f78199d269c7ead74b587926c2105abe7ab3072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-remoto \
python314-remoto \
python3dist-remoto"

RDEPENDS:${PN} += "python-abi \
python314-execnet"

inherit rpm
