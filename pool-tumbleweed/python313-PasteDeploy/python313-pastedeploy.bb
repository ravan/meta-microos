SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python313-PasteDeploy-3.1.0-1.5.noarch.rpm"
RPM_HASH = "10728e4549b15d87a4cd31fa36451566bd9791a44cea65486218c34c968261af5237847c47b84838df69420ab64c5ef7f7cea579df6450725663ef00e6ba46eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PasteDeploy \
python3-pastedeploy \
python3.13dist-pastedeploy \
python313-PasteDeploy \
python313-pastedeploy \
python3dist-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python313-Paste \
python313-setuptools"

inherit rpm
