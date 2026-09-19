SUMMARY = "Run time data for hwloc"
DESCRIPTION = "This package contains the run time data for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "hwloc-data-2.13.0-1.3.noarch.rpm"
RPM_HASH = "fb40cd81eeb77098e84add5af84d0a3a8fec7b186d8230676fa9f23479aa4b48bf309b44caef6e44dbbff929b26e0285387023f7794f8f9f6bdea478de566fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-data"

RDEPENDS:${PN} += ""

inherit rpm
