SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "4.0.2"

RPM_NAME = "python312-flit-core-4.0.2-1.1.noarch.rpm"
RPM_HASH = "74d7635d117f96c82e9c848e90a919fb671aba88bcf3a1d59b9e0349c0660dbd536640332959d0f0ece2516b87d9ddb2730a50787ca95490d678226cb554c273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-flit-core \
python312-flit-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
