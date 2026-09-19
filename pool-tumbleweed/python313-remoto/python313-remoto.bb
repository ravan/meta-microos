SUMMARY = "Remote command executor using ssh and Python in the remote end"
DESCRIPTION = "Remote command executor using ssh and Python in the remote end. This \
package is primarily built to support the ceph-deploy project. \
python-remoto is built upon python-execnet which manages the \
connections and processes."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python313-remoto-1.2.1-2.9.noarch.rpm"
RPM_HASH = "467740083d90b1e17ffb5690f56e70cc495d378de441752bc1b04d2a55e928e975224d26e069d5872d1dcd1cdbce6eedfc7425ec3f126b533264b860483dee65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-remoto \
python3.13dist-remoto \
python313-remoto \
python3dist-remoto"

RDEPENDS:${PN} += "python-abi \
python313-execnet"

inherit rpm
