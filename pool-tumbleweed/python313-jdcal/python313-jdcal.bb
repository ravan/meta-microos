SUMMARY = "Julian dates from proleptic Gregorian and Julian calendars"
DESCRIPTION = "This module contains functions for converting between Julian dates and \
calendar dates. \
 \
A function for converting Gregorian calendar dates to Julian dates, and \
another function for converting Julian calendar dates to Julian dates \
are defined. Two functions for the reverse calculations are also \
defined."
LICENSE = "BSD-2-Clause"

PV = "1.4.1"

RPM_NAME = "python313-jdcal-1.4.1-3.5.noarch.rpm"
RPM_HASH = "a55ab979f0bb7cb64695de2bfcadd18d98191f6796fe5d60746fb0f7fb8099607e817150a7bf9a3aa005cb031e9635a4d5daef64b942aa2b6e8ed89922dacf5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jdcal \
python3.13dist-jdcal \
python313-jdcal \
python3dist-jdcal"

RDEPENDS:${PN} += "python-abi"

inherit rpm
