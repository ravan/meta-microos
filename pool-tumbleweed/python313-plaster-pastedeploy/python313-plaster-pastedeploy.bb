SUMMARY = "A loader implementing the PasteDeploy syntax to be used by plaster"
DESCRIPTION = "plaster_pastedeploy is a plaster plugin that provides a plaster.Loader \
that can parse ini files according to the standard set by PasteDeploy. \
It supports the wsgi plaster protocol, implementing the \
plaster.protocols.IWSGIProtocol interface."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-plaster-pastedeploy-1.0.1-3.5.noarch.rpm"
RPM_HASH = "2f992cae0785ad7bb5f55f335996f7d69f55d57ada9239d3516156f983b670a79f7939598e8cdb43dfe15b40e7d8ed60cfc55ca9a16ad4cb1049b8f48cf49c1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plaster-pastedeploy \
python3.13dist-plaster-pastedeploy \
python313-plaster-pastedeploy \
python3dist-plaster-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python313-PasteDeploy \
python313-plaster"

inherit rpm
