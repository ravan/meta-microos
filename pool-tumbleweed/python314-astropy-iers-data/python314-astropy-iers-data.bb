SUMMARY = "IERS Earth Rotation and Leap Second tables for the astropy core package"
DESCRIPTION = "IERS Earth Rotation and Leap Second tables for the astropy core package \
 \
Note: This package is not currently meant to be used directly by users, and only meant to be used from the core astropy package."
LICENSE = "BSD-3-Clause"

PV = "0.2026.7.13.0.54.2"

RPM_NAME = "python314-astropy-iers-data-0.2026.7.13.0.54.2-1.1.noarch.rpm"
RPM_HASH = "815dfd5343ed4a8b11f1b8616a9f346347a2ff76f2e427655cb020b6cb78e314d284d0ad53f4dbfb3f4d099f99b9444059cefe87181eae9f08ce072e5bb15680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-astropy-iers-data \
python314-astropy-iers-data \
python3dist-astropy-iers-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
