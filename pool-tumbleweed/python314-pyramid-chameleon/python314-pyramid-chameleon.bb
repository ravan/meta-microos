SUMMARY = "Pyramid Chameleon integration"
DESCRIPTION = "These are bindings for the `Chameleon templating system \
<http://pagetemplates.org/>`_ for the Pyramid_ web framework."
LICENSE = "BSD-3-Clause & ZPL-2.1 & MIT"

PV = "0.3"

RPM_NAME = "python314-pyramid-chameleon-0.3-6.5.noarch.rpm"
RPM_HASH = "5432240dc51fa15adca1f39976c4a010359bfb20dc3f8838b8c2aea6cdc6e2060465e08c64f0b9f36d5fa8de6fbaee5c2d7454d327515afe24e76f9c9b372b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyramid-chameleon \
python314-pyramid-chameleon \
python3dist-pyramid-chameleon"

RDEPENDS:${PN} += "python-abi \
python314-Chameleon \
python314-pyramid"

inherit rpm
