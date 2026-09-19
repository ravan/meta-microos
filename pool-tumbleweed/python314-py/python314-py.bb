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

RPM_NAME = "python314-py-1.11.0-9.6.noarch.rpm"
RPM_HASH = "d103407740f45fb4d82ff2a2e9cd00b942fbd39121b97f81759c5b1566bc3178c552c424ffaee7e95e698ed58e43fb292a2d0deec8af8028bfbfb9dc833e881a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py \
python314-py \
python3dist-py"

RDEPENDS:${PN} += "python-abi \
python314-apipkg \
python314-iniconfig"

inherit rpm
