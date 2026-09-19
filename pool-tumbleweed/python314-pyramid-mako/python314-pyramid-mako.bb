SUMMARY = "Mako template bindings for the Pyramid web framework"
DESCRIPTION = "Mako template bindings for the Pyramid web framework."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python314-pyramid-mako-1.1.0-4.5.noarch.rpm"
RPM_HASH = "27eaca90674b52fe36bd6d4cf7b23d94c2c95cc44e707014b988af14895f03a621d6363591386b0f038e0f1bffda346125909f9394e5f21d2bbe420cfe83a3ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyramid-mako \
python314-pyramid-mako \
python3dist-pyramid-mako"

RDEPENDS:${PN} += "python-abi \
python314-Mako \
python314-pyramid"

inherit rpm
