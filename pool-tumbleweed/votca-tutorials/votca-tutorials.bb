SUMMARY = "Tutorial documentation for VOTCA Coarse Graining Engine"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains the tutorial documentation and sample data."
LICENSE = "Apache-2.0"

PV = "2026"

RPM_NAME = "votca-tutorials-2026-1.7.noarch.rpm"
RPM_HASH = "11c80e1b7438426a2fba834ece5d36951b48b746c0872b5c59304cdf15bf9b37b363099a040c755caf7ec7d7930cd4dbe9c152e218ba6abd56ba96a1d3b7d182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "votca-csg-tutorials \
votca-tutorials"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3"

inherit rpm
