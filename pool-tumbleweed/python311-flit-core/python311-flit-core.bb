SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.2"

RPM_NAME = "python311-flit-core-4.0.2-1.1.noarch.rpm"
RPM_HASH = "e97a978b414f525cf8a19b4c154d41f97badba676342293fa643eaa6c1c9e9e6f49867120119ffda911eeca4ad6475555c023c4562057439a3b4d8a97c4fc99e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flit-core \
python311-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
