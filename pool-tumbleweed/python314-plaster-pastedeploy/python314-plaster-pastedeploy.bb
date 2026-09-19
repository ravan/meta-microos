SUMMARY = "A loader implementing the PasteDeploy syntax to be used by plaster"
DESCRIPTION = "plaster_pastedeploy is a plaster plugin that provides a plaster.Loader \
that can parse ini files according to the standard set by PasteDeploy. \
It supports the wsgi plaster protocol, implementing the \
plaster.protocols.IWSGIProtocol interface."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-plaster-pastedeploy-1.0.1-3.5.noarch.rpm"
RPM_HASH = "115bc3f35797d9a3d99b62de11883cf8a1797ded81b2e122e9bd4b3db7fae9a9f5a34ec9d49e7e7aa5fa9f9c361c77d86f6f1e52321e22a62496e80edb009f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-plaster-pastedeploy \
python314-plaster-pastedeploy \
python3dist-plaster-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python314-PasteDeploy \
python314-plaster"

inherit rpm
