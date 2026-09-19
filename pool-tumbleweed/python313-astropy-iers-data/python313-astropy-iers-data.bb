SUMMARY = "IERS Earth Rotation and Leap Second tables for the astropy core package"
DESCRIPTION = "IERS Earth Rotation and Leap Second tables for the astropy core package \
 \
Note: This package is not currently meant to be used directly by users, and only meant to be used from the core astropy package."
LICENSE = "BSD-3-Clause"

PV = "0.2026.7.13.0.54.2"

RPM_NAME = "python313-astropy-iers-data-0.2026.7.13.0.54.2-1.1.noarch.rpm"
RPM_HASH = "861234c316339679797e55fb36e6367b46afc7f96b0171187510c21b54594588fcf4e3e5e070304a9f0e9eeb15c777e0a9d0520129302eaf72328db53864f6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-astropy-iers-data \
python3.13dist-astropy-iers-data \
python313-astropy-iers-data \
python3dist-astropy-iers-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
