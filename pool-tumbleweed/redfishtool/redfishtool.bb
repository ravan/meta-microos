SUMMARY = "A CLI tool for accessing the Redfish API"
DESCRIPTION = "redfishtool is a commandline tool that implements the client side \
of the Redfish RESTful API for Data Center Hardware Management."
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "redfishtool-1.1.8-1.11.noarch.rpm"
RPM_HASH = "26a413746f59f300214d7fb636769b2f91511531495920198661c1bb4bec00a95b81d9d36870c520c432c2696a8826319bb01bb57edcf0ccc48d21f960c414e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-redfishtool \
python3dist-redfishtool \
redfishtool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-dateutil \
python3-requests"

inherit rpm
