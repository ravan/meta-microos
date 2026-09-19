SUMMARY = "Documentation for subnetcalc"
DESCRIPTION = "SubNetCalc is an IPv4/IPv6 subnet address calculator. \
This packages provides documentation and help files for subnetcalc."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.6"

RPM_NAME = "subnetcalc-doc-2.6.6-1.3.noarch.rpm"
RPM_HASH = "8733f1e0bba405532b963c264e37f82075853c5aa9602d53bb88bcb14416aef7364cba83a839e62cc3348d45b9bf51fd9754237279428a90282a0035a7a3f99f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subnetcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
