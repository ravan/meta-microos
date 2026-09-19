SUMMARY = "Sample datasets for Bokeh examples"
DESCRIPTION = "This package contains sample datasets for use with Bokeh examples."
LICENSE = "BSD-3-Clause"

PV = "2025.0"

RPM_NAME = "python313-bokeh_sampledata-2025.0-1.4.noarch.rpm"
RPM_HASH = "87e100e45fcd87f1b52e7d45cc0615c04bb4bdff99138001a7d3bc430f668d62990f7096dbb86bb562f24ad4234e34671387b7902a8f3d231adb7497b9053f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokeh-sampledata \
python3.13dist-bokeh-sampledata \
python313-bokeh-sampledata \
python3dist-bokeh-sampledata"

RDEPENDS:${PN} += "python-abi \
python313-icalendar \
python313-pandas"

inherit rpm
