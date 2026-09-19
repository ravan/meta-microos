SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.2"

RPM_NAME = "python314-flit-core-4.0.2-1.1.noarch.rpm"
RPM_HASH = "f0fd47b11411dcfcbb627122fc59a251dfba6adb5933cc208350a6c895bcad61f4213a732d9caa5be6df57ed204334a7e12faaa3bc0b5c045fe5693e207273f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flit-core \
python314-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
