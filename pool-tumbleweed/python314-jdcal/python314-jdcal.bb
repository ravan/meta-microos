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

RPM_NAME = "python314-jdcal-1.4.1-3.5.noarch.rpm"
RPM_HASH = "c26f34bad08e79493b8a0846ee6d525e38a36b51d9be9efaccb90806e7c394389851ba629cbf76409c15aba8b1440d2d623ebc28bc6defd90c99afc4c5ec00a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jdcal \
python314-jdcal \
python3dist-jdcal"

RDEPENDS:${PN} += "python-abi"

inherit rpm
