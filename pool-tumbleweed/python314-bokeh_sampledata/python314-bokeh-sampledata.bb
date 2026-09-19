SUMMARY = "Sample datasets for Bokeh examples"
DESCRIPTION = "This package contains sample datasets for use with Bokeh examples."
LICENSE = "BSD-3-Clause"

PV = "2025.0"

RPM_NAME = "python314-bokeh_sampledata-2025.0-1.4.noarch.rpm"
RPM_HASH = "88585f338fd5eaceb454791548a59eaf72cf50e759fc1fad1c26c64582296ae5a3bf24b7de2f28f5aacd836ba920dd88dbea4093efe9d66c5ae90b38a6e380bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bokeh-sampledata \
python314-bokeh-sampledata \
python3dist-bokeh-sampledata"

RDEPENDS:${PN} += "python-abi \
python314-icalendar \
python314-pandas"

inherit rpm
