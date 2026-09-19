SUMMARY = "Development files for flite"
DESCRIPTION = "Development files for Flite, a small, fast speech synthesis engine."
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "flite-devel-2.2-1.13.aarch64.rpm"
RPM_HASH = "7fac38ddbf7099451a4355bae82603af57219a81fdf7824d184851fc1a2f6f74d61dfca381a356eae1ee1f2e660d42f5a5c0bfcc826e287f8441f1d509e18ed0"

RPROVIDES:${PN} += "flite-devel"

RDEPENDS:${PN} += "flite"

inherit rpm
