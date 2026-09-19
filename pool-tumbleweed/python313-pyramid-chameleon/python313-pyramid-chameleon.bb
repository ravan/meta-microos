SUMMARY = "Pyramid Chameleon integration"
DESCRIPTION = "These are bindings for the `Chameleon templating system \
<http://pagetemplates.org/>`_ for the Pyramid_ web framework."
LICENSE = "BSD-3-Clause & ZPL-2.1 & MIT"

PV = "0.3"

RPM_NAME = "python313-pyramid-chameleon-0.3-6.5.noarch.rpm"
RPM_HASH = "f24a4c3a7069d3cd067f732b2a90ccb854a0012575c4ebbb873fb6855a970f4c512b03daa36867fa0025f9ff058d51c49d5c4e4931ba432b423b9435a25951c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid-chameleon \
python3.13dist-pyramid-chameleon \
python313-pyramid-chameleon \
python3dist-pyramid-chameleon"

RDEPENDS:${PN} += "python-abi \
python313-Chameleon \
python313-pyramid"

inherit rpm
