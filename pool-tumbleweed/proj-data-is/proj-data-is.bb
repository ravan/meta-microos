SUMMARY = "Island datum grids for Proj"
DESCRIPTION = "Island datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-is-9.8.1-2.3.noarch.rpm"
RPM_HASH = "821b4da57434115188fd223b5107aae39166a33eff2552b2bf6caf53558553da6f253f0d3f664d663732b96eb3e1ca732048b40a6467fd3039c27e6f5351ae8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-is"

RDEPENDS:${PN} += ""

inherit rpm
