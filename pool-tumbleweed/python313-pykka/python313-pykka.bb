SUMMARY = "A Python implementation of the actor model"
DESCRIPTION = "Pykka is a Python implementation of the `actor model \
<http://en.wikipedia.org/wiki/Actor_model>`_. The actor model introduces some \
rules to control the sharing of state and cooperation between execution \
units, with which one can build concurrent applications."
LICENSE = "Apache-2.0"

PV = "4.4.2"

RPM_NAME = "python313-pykka-4.4.2-1.3.noarch.rpm"
RPM_HASH = "88dade4026da376f308a5816f8ea61c3d6cc554a5ba2d94fa1ade544fe63ae5453124c78ed14ab29a65c25e7dd5d24f35d3f1fc002bfc444ff34efed8f1512b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pykka \
python3-pykka \
python3.13dist-pykka \
python313-Pykka \
python313-pykka \
python3dist-pykka"

RDEPENDS:${PN} += "python-abi"

inherit rpm
