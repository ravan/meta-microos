SUMMARY = "Documentation for python313-venusian"
DESCRIPTION = "This package contains documentation files for python313-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.1.1"

RPM_NAME = "python313-venusian-doc-3.1.1-1.7.noarch.rpm"
RPM_HASH = "65282ec94f9d6028d79adce970aacaa68e9a8c6754859fa135ec0da73bfcd699aa9147abc92a8a3914da470a719bfb674ff7c1dd39344cde3c94646ee90529d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-venusian-doc \
python313-venusian-doc"

RDEPENDS:${PN} += "python313-venusian"

inherit rpm
