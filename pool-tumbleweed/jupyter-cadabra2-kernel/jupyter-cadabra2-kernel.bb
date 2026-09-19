SUMMARY = "Jupyter kernel for cadabra2"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides a jupyter kernel for cadabra2."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.14"

RPM_NAME = "jupyter-cadabra2-kernel-2.5.14-3.1.aarch64.rpm"
RPM_HASH = "80e0a30f3744ee2c04c5a8f275258a6cf755bd420854ac28fdfc5dc99a442e35f30bcbadd69e2b105de755afd431dc04e021e35ea0a777de34b7efde34dec394"

RPROVIDES:${PN} += "jupyter-cadabra2-kernel"

RDEPENDS:${PN} += "cadabra2 \
jupyter-notebook \
python-abi"

inherit rpm
