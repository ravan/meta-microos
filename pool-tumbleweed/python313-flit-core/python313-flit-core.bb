SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.2"

RPM_NAME = "python313-flit-core-4.0.2-1.1.noarch.rpm"
RPM_HASH = "5e04f8ef3b9c701f8e587052ac35f6ce68af7248ee97167f1436e1e802f19c6745a0c1c0f03ca366bbf512c9c025c887fabfa47533e86ae7e17770f952c3c480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit-core \
python3.13dist-flit-core \
python313-flit-core \
python3dist-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
