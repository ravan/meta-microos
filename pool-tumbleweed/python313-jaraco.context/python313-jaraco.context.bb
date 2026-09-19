SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "6.1.2"

RPM_NAME = "python313-jaraco.context-6.1.2-1.3.noarch.rpm"
RPM_HASH = "2d3b4a5defa3883b9f19deb195353aa8498e8775a3815e2ce44aaf8cfa35a51cacff8ad7373ab4e9e599eb0106a8041a95d84e9ce755db65e02b0efc86a2d854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.context \
python3.13dist-jaraco.context \
python313-jaraco.context \
python3dist-jaraco.context"

RDEPENDS:${PN} += "python-abi \
python313-backports.tarfile"

inherit rpm
