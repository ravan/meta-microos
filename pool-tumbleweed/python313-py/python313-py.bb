SUMMARY = "Library with cross-python path, ini-parsing, io, code, log facilities"
DESCRIPTION = "The py lib is a Python development support library featuring \
the following tools and modules: \
 \
* py.path:  uniform local and svn path objects \
* py.apipkg:  explicit API control and lazy-importing \
* py.iniconfig:  easy parsing of .ini files \
* py.code: dynamic code generation and introspection \
* py.path:  uniform local and svn path objects"
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "python313-py-1.11.0-9.6.noarch.rpm"
RPM_HASH = "43fb3054bfc2e8fd254063263dc03e374462a3289663ec365d9f580604f234a29c43cf5223d2450ec69011b34bc9ae3097223db85838ccd7bb94c23ebee725d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py \
python3.13dist-py \
python313-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python313-apipkg \
python313-iniconfig"

inherit rpm
