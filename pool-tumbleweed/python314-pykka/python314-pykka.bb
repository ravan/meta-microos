SUMMARY = "A Python implementation of the actor model"
DESCRIPTION = "Pykka is a Python implementation of the `actor model \
<http://en.wikipedia.org/wiki/Actor_model>`_. The actor model introduces some \
rules to control the sharing of state and cooperation between execution \
units, with which one can build concurrent applications."
LICENSE = "Apache-2.0"

PV = "4.4.2"

RPM_NAME = "python314-pykka-4.4.2-1.3.noarch.rpm"
RPM_HASH = "df53bb4d2be86e89e2291b0eb3a9b8d794cc4b0653e28172775eb101bfc7770fe84081664ba90c5c233276f868c904da5b4f7814c30d84186e695a6351cd75ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pykka \
python314-Pykka \
python314-pykka \
python3dist-pykka"

RDEPENDS:${PN} += "python-abi"

inherit rpm
